package br.com.mvv.aqceacha.model.repository;

import br.com.mvv.aqceacha.model.Cliente;
import br.com.mvv.aqceacha.model.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryQuery {
}
