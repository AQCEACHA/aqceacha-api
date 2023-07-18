package br.com.mvv.aqceacha.repository.venda;

import br.com.mvv.aqceacha.repository.filter.VendaFilter;
import br.com.mvv.aqceacha.repository.projections.VendaDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VendaRepositoryQuery {

    public Page<VendaDto> filtrar(VendaFilter vendaFilter, Pageable pageable);

}
