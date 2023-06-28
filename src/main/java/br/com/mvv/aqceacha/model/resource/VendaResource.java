package br.com.mvv.aqceacha.model.resource;

import br.com.mvv.aqceacha.model.Cidade;
import br.com.mvv.aqceacha.model.Venda;
import br.com.mvv.aqceacha.model.repository.VendaRepository;
import br.com.mvv.aqceacha.model.repository.filter.CidadeFilter;
import br.com.mvv.aqceacha.model.repository.filter.VendaFilter;
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
    public Page<Venda> pesquisar(VendaFilter vendaFilter, Pageable pageable){
        return vendaRepository.filtrar(vendaFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Venda> listarTodasVendas() {return vendaRepository.findAll();}
}
