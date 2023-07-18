package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.Venda;
import br.com.mvv.aqceacha.repository.VendaRepository;
import br.com.mvv.aqceacha.repository.filter.VendaFilter;
import br.com.mvv.aqceacha.repository.projections.VendaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaResource {

    @Autowired
    private VendaRepository vendaRepository;

    @GetMapping()
    public Page<VendaDto> pesquisar(VendaFilter vendaFilter, Pageable pageable){
        return vendaRepository.filtrar(vendaFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Venda> listarTodasVendas() {return vendaRepository.findAll();}
}
