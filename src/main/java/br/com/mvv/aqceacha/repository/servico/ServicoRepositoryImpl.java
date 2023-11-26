package br.com.mvv.aqceacha.repository.servico;

import br.com.mvv.aqceacha.model.Servico;
import br.com.mvv.aqceacha.repository.filter.ServicoFilter;
import br.com.mvv.aqceacha.repository.projections.ServicoDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ServicoRepositoryImpl implements ServicoRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ServicoDto> filtrar(ServicoFilter servicoFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ServicoDto> criteria = builder.createQuery(ServicoDto.class);
        Root<Servico> root = criteria.from(Servico.class);

        criteria.select(builder.construct(ServicoDto.class,
                root.get("idserv"),
                root.get("nomeserv"),
                root.get("precovenda")
        ));

        Predicate[] predicates = criarRestricoes(servicoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomeserv")));
        criteria.orderBy(builder.asc(root.get("precovenda")));

        TypedQuery<ServicoDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(servicoFilter));
    }

    private Long total(ServicoFilter servicoFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Servico> root = criteria.from(Servico.class);

        Predicate[] predicates = criarRestricoes(servicoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomeserv")));
        criteria.orderBy(builder.asc(root.get("precovenda")));

        criteria.select(builder.count(root));

        return manager.createQuery(criteria).getSingleResult();

    }

    private void adicionarRestricoes(TypedQuery<?> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);

    }

    private Predicate[] criarRestricoes(ServicoFilter servicoFilter, CriteriaBuilder builder, Root<Servico> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(servicoFilter.getNomeserv())){
            predicates.add(builder.like(builder.lower(root.get("nomeserv")),
                    "%" + servicoFilter.getNomeserv().toLowerCase() + "%" ));
        }
        if (servicoFilter.getPrecovenda() != null){
            predicates.add(builder.lessThanOrEqualTo(root.get("precovenda"),
                    servicoFilter.getPrecovenda()));
        }
        if (servicoFilter.getPrecovenda() != null){
            predicates.add(builder.greaterThanOrEqualTo(root.get("precovenda"),
                    servicoFilter.getPrecovenda()));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

}
