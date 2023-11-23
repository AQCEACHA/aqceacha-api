package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.ImagensServico;
import br.com.mvv.aqceacha.model.Servico;
import br.com.mvv.aqceacha.model.ServicoVendedor;
import br.com.mvv.aqceacha.model.Vendedor;
import br.com.mvv.aqceacha.repository.ServicoRepository;
import br.com.mvv.aqceacha.repository.filter.ServicoFilter;
import br.com.mvv.aqceacha.repository.projections.ServicoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/servico")
public class ServicoResource {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping()
    public Page<ServicoDto> pesquisar(ServicoFilter servicoFilter, Pageable pageable){
        return servicoRepository.filtrar(servicoFilter, pageable);
    }

  @CrossOrigin("*")
  @GetMapping("/{id}")
  public Servico getById(@PathVariable Long id) {
    Optional<Servico> servicoOptional = servicoRepository.findById(id);
    if (servicoOptional.isPresent()) {
      Servico servico = servicoOptional.get();

    }
    return null;
  }


  @GetMapping("/todos")
    public List<Servico> listarTodasVendas() {return servicoRepository.findAll();}
}


