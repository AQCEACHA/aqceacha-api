package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.Vendedor;
import br.com.mvv.aqceacha.repository.VendedorRepository;
import br.com.mvv.aqceacha.repository.filter.VendedorFilter;
import br.com.mvv.aqceacha.repository.projections.VendedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorResource {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping()
    public Page<VendedorDto> pesquisar(VendedorFilter vendedorFilter, Pageable pageable){
        return vendedorRepository.filtrar(vendedorFilter, pageable);
    }

    @CrossOrigin("*")
    @GetMapping("/todos")
    public List<Vendedor> listarTodosVendedor() {return vendedorRepository.findAll();}
}
