package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.ServicoVendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoVendedorRepository extends JpaRepository<ServicoVendedor, Long> {

}
