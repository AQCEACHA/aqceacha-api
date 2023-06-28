package br.com.mvv.aqceacha.model.repository;

import br.com.mvv.aqceacha.model.RamoAtv;
import br.com.mvv.aqceacha.model.repository.ramoatv.RamoAtvRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RamoAtvRepository extends JpaRepository<RamoAtv, Long>, RamoAtvRepositoryQuery {
}
