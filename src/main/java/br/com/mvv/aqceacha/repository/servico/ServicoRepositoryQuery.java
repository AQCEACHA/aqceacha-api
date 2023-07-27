package br.com.mvv.aqceacha.repository.servico;

import br.com.mvv.aqceacha.repository.filter.ServicoFilter;
import br.com.mvv.aqceacha.repository.projections.ServicoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServicoRepositoryQuery {

    public Page<ServicoDto> filtrar(ServicoFilter servicoFilter, Pageable pageable);
}
