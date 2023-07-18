package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Cidade;
import br.com.mvv.aqceacha.repository.cidade.CidadeRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>, CidadeRepositoryQuery {
}
