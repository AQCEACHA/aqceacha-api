package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.*;
import br.com.mvv.aqceacha.repository.*;
import br.com.mvv.aqceacha.repository.filter.VendedorFilter;
import br.com.mvv.aqceacha.repository.projections.VendedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/vendedor")
public class VendedorResource {

    @Autowired
    private VendedorRepository vendedorRepository;
  @Autowired
  private ServicoRepository servicoRepository;
  @Autowired
  private ImagensRepository imagensRepository;

  @Autowired
  private FavoritoClienteRepository favoritoClienteRepository;

  @Autowired
  private FavoritoRepository favoritoRepository;

  @Autowired
  private ClienteRepository clienteRepository;

    @GetMapping()
    public Page<VendedorDto> pesquisar(VendedorFilter vendedorFilter, Pageable pageable){
        return vendedorRepository.filtrar(vendedorFilter, pageable);
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    public VendedorDto getById(@PathVariable Long id) {
      Optional<Vendedor> vendedorOptional = vendedorRepository.findById(id);
      if (vendedorOptional.isPresent()) {
        Vendedor vendedor = vendedorOptional.get();

        List<ServicoVendedor> servicoVendedor = vendedor.getServicosVendedor();

        List<Servico> servicos = servicoVendedor.stream().map(
          item -> servicoRepository.findById(item.getServico().getIdserv()).get()
        ).collect(Collectors.toList());

        List<ImagensVendedor> imagensVendedor = vendedor.getImagensVendedor();

        List<Imagens> imagens = imagensVendedor.stream().map(
                item -> imagensRepository.findById(item.getImagens().getIdimg()).get()
        ).collect(Collectors.toList());

        VendedorDto vendedorDto = new VendedorDto(
          vendedor.getIdven(),
          vendedor.getNomeven(),
          vendedor.getRamoatv().getRamo(),
          vendedor.getCidade().getNomecidade(),
          vendedor.getCidade().getUf(),
          vendedor.getStar(),
          servicos,
          vendedor.getImgven(),
          vendedor.getApelidoven(),
          vendedor.getEmailven(),
          vendedor.getTelefoneven(),
          imagens
        );

        return vendedorDto;
      }
      return null;
    }

    @PostMapping("/favorito/{id}")
    public void adicionarFavorito(@PathVariable Long idven){
      Optional<Cliente> clienteOptional = clienteRepository.findById(1L);
      if (clienteOptional.isPresent()) {
        Cliente cliente = clienteOptional.get();
        List<FavoritoCliente> favoritos = cliente.getFavoritoCliente();
        Vendedor vendedor = vendedorRepository.findById(idven).get();
        Favorito favorito = new Favorito();
        favorito.setVendedor(vendedor);
        favorito = favoritoRepository.save(favorito);
        FavoritoCliente favoritoCliente = new FavoritoCliente();
        favoritoCliente.setFavorito(favorito);
        favoritoCliente.setCliente(cliente);
        favoritoClienteRepository.save(favoritoCliente);
      } else {
        return;
      }
    }

  @GetMapping("/favorito/existe/{id}")
  public boolean verificarFavorito(@PathVariable Long idven){
    Cliente cliente = clienteRepository.findById(1L).get();
    Vendedor vendedor = vendedorRepository.findById(idven).get();
    List<FavoritoCliente> favoritos = cliente.getFavoritoCliente().stream().filter(
            favoritoCliente -> favoritoCliente.getFavorito().getVendedor().equals(vendedor)
    ).collect(Collectors.toList());
    if (favoritos.stream().count() >= 1) {
      return true;
    }
    return false;
  }

  @PostMapping("favorito/remover/{id}")
  public void removerFavorito(@PathVariable Long idven) {
    Cliente cliente = clienteRepository.findById(1L).get();
    Vendedor vendedor = vendedorRepository.findById(idven).get();
    List<FavoritoCliente> favoritos = cliente.getFavoritoCliente();
    favoritos.forEach(
            favoritocliente -> {
              Favorito favorito = favoritoRepository.findById(favoritocliente.getIdfavcli()).get();
              if (favorito.getVendedor().equals(vendedor)) {
                favoritoRepository.delete(favorito);
                favoritoClienteRepository.delete(favoritocliente);
              }
            }
    );
  }

    @CrossOrigin("*")
    @GetMapping("/todos")
    public List<Vendedor> listarTodosVendedor() {return vendedorRepository.findAll();}
}
