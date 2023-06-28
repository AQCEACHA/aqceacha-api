package br.com.mvv.aqceacha.model.repository.cliente;

import br.com.mvv.aqceacha.model.Cliente;
import br.com.mvv.aqceacha.model.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {

    public Page<Cliente> filtrar(ClienteFilter clienteFilter, Pageable pageable);
}
