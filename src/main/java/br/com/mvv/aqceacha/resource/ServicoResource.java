package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.Servico;
import br.com.mvv.aqceacha.repository.ServicoRepository;
import br.com.mvv.aqceacha.repository.filter.ServicoFilter;
import br.com.mvv.aqceacha.repository.projections.ServicoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoResource {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping()
    public Page<ServicoDto> pesquisar(ServicoFilter servicoFilter, Pageable pageable){
        return servicoRepository.filtrar(servicoFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Servico> listarTodasVendas() {return servicoRepository.findAll();}
}


