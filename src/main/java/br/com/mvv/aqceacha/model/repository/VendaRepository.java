package br.com.mvv.aqceacha.model.repository;

import br.com.mvv.aqceacha.model.Venda;
import br.com.mvv.aqceacha.model.repository.filter.VendaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}
