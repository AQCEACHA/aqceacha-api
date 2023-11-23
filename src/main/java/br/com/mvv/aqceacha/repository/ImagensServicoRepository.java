package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.ImagensServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagensServicoRepository extends JpaRepository<ImagensServico, Long> {
}
