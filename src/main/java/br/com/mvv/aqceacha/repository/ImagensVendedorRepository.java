package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.ImagensVendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagensVendedorRepository extends JpaRepository<ImagensVendedor, Long> {
}
