package br.com.mvv.aqceacha.repository;

import br.com.mvv.aqceacha.model.Vendedor;
import br.com.mvv.aqceacha.repository.vendedor.VendedorRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>, VendedorRepositoryQuery {

    Vendedor findByFavoritoIdfav(Long idfav);


}
