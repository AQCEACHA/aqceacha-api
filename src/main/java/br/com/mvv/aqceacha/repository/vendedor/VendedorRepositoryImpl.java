package br.com.mvv.aqceacha.repository.vendedor;

import br.com.mvv.aqceacha.model.Vendedor;
import br.com.mvv.aqceacha.repository.filter.VendedorFilter;
import br.com.mvv.aqceacha.repository.projections.VendedorDto;
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

public class VendedorRepositoryImpl implements VendedorRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<VendedorDto> filtrar(VendedorFilter vendedorFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<VendedorDto> criteria = builder.createQuery(VendedorDto.class);
        Root<Vendedor> root = criteria.from(Vendedor.class);

        criteria.select(builder.construct(VendedorDto.class,
                root.get("idven"),
                root.get("nomeven"),
                root.get("ramoatv").get("ramo"),
                root.get("cidade").get("nomecidade"),
                root.get("cidade").get("uf")

        ));

        Predicate[] predicates = criarRestricoes(vendedorFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomeven")));
        criteria.orderBy(builder.asc(root.get("ramoatv").get("ramo")));
        criteria.orderBy(builder.asc(root.get("cidade").get("nomecidade")));
        criteria.orderBy(builder.asc(root.get("cidade").get("uf")));

        TypedQuery<VendedorDto> query = manager.createQuery(criteria);
        adicionarRestricoes(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(vendedorFilter));
    }

    private Long total(VendedorFilter vendedorFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Vendedor> root = criteria.from(Vendedor.class);

        Predicate[] predicates = criarRestricoes(vendedorFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomeven")));
        criteria.orderBy(builder.asc(root.get("ramo")));
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

    private Predicate[] criarRestricoes(VendedorFilter vendedorFilter, CriteriaBuilder builder, Root<Vendedor> root) {

        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(vendedorFilter.getNomeven())){
            predicates.add(builder.like(builder.lower(root.get("nomeven")),
                    "%" + vendedorFilter.getNomeven().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(vendedorFilter.getRamo())){
            predicates.add(builder.like(builder.lower(root.get("ramoatv").get("ramo")),
                    "%" + vendedorFilter.getRamo().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(vendedorFilter.getNomecidade())){
            predicates.add(builder.like(builder.lower(root.get("cidade").get("nomecidade")),
                    "%" + vendedorFilter.getNomecidade().toLowerCase() + "%" ));
        }
        if (!StringUtils.isEmpty(vendedorFilter.getUf())){
            predicates.add(builder.like(builder.lower(root.get("cidade").get("uf")),
                    "%" + vendedorFilter.getUf().toLowerCase() + "%" ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }
}
