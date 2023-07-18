package br.com.mvv.aqceacha.repository.cliente;

import br.com.mvv.aqceacha.repository.filter.ClienteFilter;
import br.com.mvv.aqceacha.repository.projections.ClienteDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {

    public Page<ClienteDto> filtrar(ClienteFilter clienteFilter, Pageable pageable);
}
