package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Cliente;
import br.com.mvv.aqceacha.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryQuery {
}
