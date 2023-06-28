package br.com.mvv.aqceacha.model.repository.vendedor;

import br.com.mvv.aqceacha.model.Vendedor;
import br.com.mvv.aqceacha.model.repository.filter.VendedorFilter;
import br.com.mvv.aqceacha.model.repository.projections.VendedorDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VendedorRepositoryQuery {

    public Page<VendedorDto> filtrar(VendedorFilter vendedorFilter, Pageable pageable);
}
