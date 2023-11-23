package br.com.mvv.aqceacha.resource;

import br.com.mvv.aqceacha.model.*;
import br.com.mvv.aqceacha.repository.ImagensRepository;
import br.com.mvv.aqceacha.repository.ServicoRepository;
import br.com.mvv.aqceacha.repository.VendedorRepository;
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

        Stream<Servico> servicos = servicoVendedor.stream().map(
          item -> servicoRepository.findById(item.getServico().getIdserv()).get()
        );

        List<ImagensVendedor> imagensVendedor = vendedor.getImagensVendedor();

        Stream<Imagens> imagens = imagensVendedor.stream().map(
                item -> imagensRepository.findById(item.getImagens().getIdimg()).get()
        );

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

    @CrossOrigin("*")
    @GetMapping("/todos")
    public List<Vendedor> listarTodosVendedor() {return vendedorRepository.findAll();}
}
