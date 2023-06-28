package br.com.mvv.aqceacha.model.repository.cidade;

import br.com.mvv.aqceacha.model.Cidade;
import br.com.mvv.aqceacha.model.repository.filter.CidadeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

    public Page<Cidade> filtrar(CidadeFilter cidadeFilter, Pageable pageable);

}

