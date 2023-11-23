package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Imagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagensRepository extends JpaRepository<Imagens, Long> {
}
