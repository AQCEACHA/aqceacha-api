package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Venda;
import br.com.mvv.aqceacha.repository.venda.VendaRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>, VendaRepositoryQuery {
}
