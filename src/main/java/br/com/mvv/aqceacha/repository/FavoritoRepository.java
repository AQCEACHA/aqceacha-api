package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Favorito;
import br.com.mvv.aqceacha.repository.favorito.FavoritoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long>, FavoritoRepositoryQuery {
}
