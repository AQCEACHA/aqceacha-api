package br.com.mvv.aqceacha.model.repository.ramoatv;

import br.com.mvv.aqceacha.model.RamoAtv;
import br.com.mvv.aqceacha.model.repository.filter.RamoAtvFilter;
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

public class RamoAtvRepositoryImpl implements RamoAtvRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<RamoAtv> filtrar(RamoAtvFilter ramoAtvFilter, Pageable pageable){

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<RamoAtv> criteria = builder.createQuery(RamoAtv.class);
        Root<RamoAtv> root = criteria.from(RamoAtv.class);

        Predicate[] predicates = criarRestricoes(ramoAtvFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("ramo")));
        criteria.orderBy(builder.asc(root.get("nomecidade")));
        criteria.orderBy(builder.asc(root.get("uf")));


        TypedQuery<RamoAtv> query = manager.createQuery(criteria);

        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(ramoAtvFilter));
    }
    private Long total(RamoAtvFilter ramoAtvFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<RamoAtv> root = criteria.from(RamoAtv.class);

        Predicate[] predicates = criarRestricoes(ramoAtvFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("ramo")));
        criteria.orderBy(builder.asc(root.get("nomecidade")));
        criteria.orderBy(builder.asc(root.get("uf")));

        criteria.select(builder.count(root));

        return manager.createQuery(criteria).getSingleResult();

    }

    private void adicionarRestricoes(TypedQuery<RamoAtv> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);

    }

    private Predicate[] criarRestricoes(RamoAtvFilter ramoAtvFilter, CriteriaBuilder builder, Root<RamoAtv> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(ramoAtvFilter.getRamo())){
            predicates.add(builder.like(builder.lower(root.get("ramo")),
                    "%" + ramoAtvFilter.getRamo().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(ramoAtvFilter.getNomecidade())){
            predicates.add(builder.like(builder.lower(root.get("nomecidade")),
                    "%" + ramoAtvFilter.getNomecidade().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(ramoAtvFilter.getUf())){
            predicates.add(builder.like(builder.lower(root.get("uf")),
                    "%" + ramoAtvFilter.getUf().toLowerCase() + "%" ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
