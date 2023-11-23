package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.FavoritoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritoClienteRepository extends JpaRepository<FavoritoCliente, Long> {
}
