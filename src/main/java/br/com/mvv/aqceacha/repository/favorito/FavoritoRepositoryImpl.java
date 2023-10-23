package br.com.mvv.aqceacha.repository.favorito;

import br.com.mvv.aqceacha.model.Favorito;
import br.com.mvv.aqceacha.repository.filter.FavoritoFilter;
import br.com.mvv.aqceacha.repository.projections.FavoritoDto;
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

public class FavoritoRepositoryImpl implements FavoritoRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<FavoritoDto> filtrar(FavoritoFilter favoritoFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<FavoritoDto> criteria = builder.createQuery(FavoritoDto.class);
        Root<Favorito> root = criteria.from(Favorito.class);

        criteria.select(builder.construct(FavoritoDto.class,
                root.get("idfav"),
                root.get("vendedor").get("nomeven")
        ));

        Predicate[] predicates = criarRestricoes(favoritoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("idfav")));
        criteria.orderBy(builder.asc(root.get("vendedor").get("nomeven")));

        TypedQuery<FavoritoDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(favoritoFilter));
    }

    private Long total(FavoritoFilter favoritoFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Favorito> root = criteria.from(Favorito.class);

        Predicate[] predicates = criarRestricoes(favoritoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("vendedor").get("nomeven")));

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

    private Predicate[] criarRestricoes(FavoritoFilter favoritoFilter, CriteriaBuilder builder, Root<Favorito> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(favoritoFilter.getNomeven())){
            predicates.add(builder.like(builder.lower(root.get("vendedor").get("nomeven")),
                    "%" + favoritoFilter.getNomeven().toLowerCase() + "%" ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

}
