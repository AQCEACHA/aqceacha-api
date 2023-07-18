package br.com.mvv.aqceacha.repository.ramoatv;

import br.com.mvv.aqceacha.model.RamoAtv;
import br.com.mvv.aqceacha.repository.filter.RamoAtvFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RamoAtvRepositoryQuery {

    public Page<RamoAtv> filtrar(RamoAtvFilter ramoAtvFilter, Pageable pageable);
}
