package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.*;
import br.com.mvv.aqceacha.repository.ClienteRepository;
import br.com.mvv.aqceacha.repository.FavoritoClienteRepository;
import br.com.mvv.aqceacha.repository.FavoritoRepository;
import br.com.mvv.aqceacha.repository.filter.ClienteFilter;
import br.com.mvv.aqceacha.repository.projections.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private FavoritoRepository favoritoRepository;

    @GetMapping()
    public Page<ClienteDto> pesquisar(ClienteFilter clienteFilter, Pageable pageable){
        return clienteRepository.filtrar(clienteFilter, pageable);
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public ClienteDto getById(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();

            List<FavoritoCliente> favoritoCliente = cliente.getFavoritoCliente();

            Stream<Favorito> favorito = favoritoCliente.stream().map(
                    item -> favoritoRepository.findById(item.getFavorito().getIdfav()).get()
            );

            ClienteDto clienteDto = new ClienteDto(
                    cliente.getIdcli(),
                    cliente.getNomecli(),
                    cliente.getCidade().getNomecidade(),
                    cliente.getCidade().getUf(),
                    favorito
            );

            return clienteDto;
        }
        return null;
    }

    @CrossOrigin("/*")
    @GetMapping("/todos")
    public List<Cliente> listarTodosCliente() {return clienteRepository.findAll();}
}
