package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Servico;
import br.com.mvv.aqceacha.repository.servico.ServicoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long>, ServicoRepositoryQuery {
}
