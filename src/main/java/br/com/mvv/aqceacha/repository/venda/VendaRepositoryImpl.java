package br.com.mvv.aqceacha.repository.venda;

import br.com.mvv.aqceacha.model.Venda;
import br.com.mvv.aqceacha.repository.filter.VendaFilter;
import br.com.mvv.aqceacha.repository.projections.VendaDto;
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

public class VendaRepositoryImpl implements VendaRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<VendaDto> filtrar(VendaFilter vendaFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<VendaDto> criteria = builder.createQuery(VendaDto.class);
        Root<Venda> root = criteria.from(Venda.class);

        criteria.select(builder.construct(VendaDto.class,
                root.get("idvenda"),
                root.get("datavenda"),
                root.get("idcli"),
                root.get("idven")
        ));

        Predicate[] predicates = criarRestricoes(vendaFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("datavenda")));
        criteria.orderBy(builder.asc(root.get("idcli").get("nomecli")));
        criteria.orderBy(builder.asc(root.get("idven").get("nomeven")));
        //criteria.orderBy(builder.asc(root.get("idven").get("precovenda")));

        TypedQuery<VendaDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(vendaFilter));
    }

    private Long total(VendaFilter vendaFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Venda> root = criteria.from(Venda.class);

        Predicate[] predicates = criarRestricoes(vendaFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("datavenda")));
        criteria.orderBy(builder.asc(root.get("idcli").get("nomecli")));
        criteria.orderBy(builder.asc(root.get("idven").get("nomeven")));
        //criteria.orderBy(builder.asc(root.get("idven").get("precovenda")));

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

    private Predicate[] criarRestricoes(VendaFilter vendaFilter, CriteriaBuilder builder, Root<Venda> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (vendaFilter.getDatavenda() != null){
            predicates.add(builder.lessThanOrEqualTo(root.get("datavenda"),
                    vendaFilter.getDatavenda()));
        }
        if (vendaFilter.getDatavenda() != null){
            predicates.add(builder.greaterThanOrEqualTo(root.get("datavenda"),
                    vendaFilter.getDatavenda()));
        }
        if (!StringUtils.isEmpty(vendaFilter.getNomecli())){
            predicates.add(builder.like(builder.lower(root.get("cliente").get("nomecli")),
                    "%" + vendaFilter.getNomecli().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(vendaFilter.getNomeven())){
            predicates.add(builder.like(builder.lower(root.get("vendedor").get("nomeven")),
                    "%" + vendaFilter.getNomeven().toLowerCase() + "%" ));
        }
        /*if (vendaFilter.getPrecovenda() != null){
            predicates.add(builder.lessThanOrEqualTo(root.get("vendedor").get("precovenda"),
                    vendaFilter.getPrecovenda()));
        }
        if (vendaFilter.getPrecovenda() != null){
            predicates.add(builder.greaterThanOrEqualTo(root.get("vendedor").get("precovenda"),
                    vendaFilter.getPrecovenda()));
        }*/

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
