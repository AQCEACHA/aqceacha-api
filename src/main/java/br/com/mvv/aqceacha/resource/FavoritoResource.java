package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.Favorito;
import br.com.mvv.aqceacha.repository.FavoritoRepository;
import br.com.mvv.aqceacha.repository.filter.ClienteFilter;
import br.com.mvv.aqceacha.repository.filter.FavoritoFilter;
import br.com.mvv.aqceacha.repository.projections.ClienteDto;
import br.com.mvv.aqceacha.repository.projections.FavoritoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favorito")
public class FavoritoResource {

    @Autowired
    private FavoritoRepository favoritoRepository;

    @GetMapping()
    public Page<FavoritoDto> pesquisar(FavoritoFilter favoritoFilter, Pageable pageable){
        return favoritoRepository.filtrar(favoritoFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Favorito> listarTodosFav() {return favoritoRepository.findAll();}
}
