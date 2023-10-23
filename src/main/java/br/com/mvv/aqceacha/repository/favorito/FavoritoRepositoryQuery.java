package br.com.mvv.aqceacha.repository.favorito;

import br.com.mvv.aqceacha.repository.filter.FavoritoFilter;
import br.com.mvv.aqceacha.repository.projections.FavoritoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FavoritoRepositoryQuery {

    public Page<FavoritoDto> filtrar(FavoritoFilter favoritoFilter, Pageable pageable);
}
