package br.com.mvv.aqceacha.repository.projections;

import br.com.mvv.aqceacha.model.Imagens;
import br.com.mvv.aqceacha.model.Servico;

import java.util.stream.Stream;

public class ServicoDto {

    private Long idserv;

    private String nomeserv;

    private String ramo;

    private Double precovenda;

  private Stream<Imagens> imagens;

  public ServicoDto(Long idserv, String nomeserv, String ramo, Double precovenda, Stream<Imagens> imagens) {
        this.idserv = idserv;
        this.nomeserv = nomeserv;
        this.ramo = ramo;
        this.precovenda = precovenda;
        this.imagens = imagens;
    }

  public Long getIdserv() {
    return idserv;
  }

  public void setIdserv(Long idserv) {
    this.idserv = idserv;
  }

  public String getNomeserv() {
    return nomeserv;
  }

  public void setNomeserv(String nomeserv) {
    this.nomeserv = nomeserv;
  }

  public String getRamo() {
    return ramo;
  }

  public void setRamo(String ramo) {
    this.ramo = ramo;
  }

  public Double getPrecovenda() {
    return precovenda;
  }

  public void setPrecovenda(Double precovenda) {
    this.precovenda = precovenda;
  }

  public Stream<Imagens> getImagens() {
    return imagens;
  }

  public void setImagens(Stream<Imagens> imagens) {
    this.imagens = imagens;
  }
}
