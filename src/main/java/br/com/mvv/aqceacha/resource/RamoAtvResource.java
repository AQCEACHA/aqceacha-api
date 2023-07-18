package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.RamoAtv;
import br.com.mvv.aqceacha.repository.RamoAtvRepository;
import br.com.mvv.aqceacha.repository.filter.RamoAtvFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ramoatv")
public class RamoAtvResource {

    @Autowired
    private RamoAtvRepository ramoAtvRepository;

    @GetMapping()
    public Page<RamoAtv> pesquisar(RamoAtvFilter ramoAtvFilter, Pageable pageable){
        return ramoAtvRepository.filtrar(ramoAtvFilter, pageable);
    }

    @GetMapping("/todos")
    public List<RamoAtv> listarTodosRamos() {return ramoAtvRepository.findAll();}
}
