package br.com.mvv.aqceacha.model.repository.cliente;

import br.com.mvv.aqceacha.model.Cliente;
import br.com.mvv.aqceacha.model.repository.filter.ClienteFilter;
import br.com.mvv.aqceacha.model.repository.projections.ClienteDto;
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

public class ClienteRepositoryImpl {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ClienteDto> filtrar(ClienteFilter clienteFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ClienteDto> criteria = builder.createQuery(ClienteDto.class);
        Root<Cliente> root = criteria.from(Cliente.class);

        criteria.select(builder.construct(ClienteDto.class,
                root.get("idcli"),
                root.get("nomecli"),
                root.get("cidade").get("nomecidade"),
                root.get("cidade").get("uf")

        ));

        Predicate[] predicates = criarRestricoes(clienteFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomecli")));
        criteria.orderBy(builder.asc(root.get("cidade").get("nomecidade")));
        criteria.orderBy(builder.asc(root.get("cidade").get("uf")));

        TypedQuery<ClienteDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(clienteFilter));
    }

    private Long total(ClienteFilter clienteFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Cliente> root = criteria.from(Cliente.class);

        Predicate[] predicates = criarRestricoes(clienteFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomecli")));
        criteria.orderBy(builder.asc(root.get("nomecidade")));
        criteria.orderBy(builder.asc(root.get("uf")));

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

    private Predicate[] criarRestricoes(ClienteFilter clienteFilter, CriteriaBuilder builder, Root<Cliente> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(clienteFilter.getNomecli())){
            predicates.add(builder.like(builder.lower(root.get("nomecli")),
                    "%" + clienteFilter.getNomecli().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(clienteFilter.getNomecidade())){
            predicates.add(builder.like(builder.lower(root.get("cidade").get("nomecidade")),
                    "%" + clienteFilter.getNomecidade().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(clienteFilter.getUf())){
            predicates.add(builder.like(builder.lower(root.get("cidade").get("uf")),
                    "%" + clienteFilter.getUf().toLowerCase() + "%" ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}

}
