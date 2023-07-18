package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.Cliente;
import br.com.mvv.aqceacha.repository.ClienteRepository;
import br.com.mvv.aqceacha.repository.filter.ClienteFilter;
import br.com.mvv.aqceacha.repository.projections.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping()
    public Page<ClienteDto> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
        return clienteRepository.filtrar(clienteFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Cliente> listarTodosCliente() {return clienteRepository.findAll();}
}
