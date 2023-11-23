package br.com.mvv.aqceacha.repository.projections;

import br.com.mvv.aqceacha.model.Servico;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class VendedorDto {

    private Long idven;

    private String nomeven;

    private String ramo;

    private String nomecidade;

    private String uf;

    private Double star;

    private String nomeserv;

    private Stream<Servico> servicos;

    private String imgven;

    private String apelidoven;

    private String emailven;

    private String telefoneven;

    public VendedorDto(Long idven, String nomeven, String ramo, String nomecidade, String uf, Double star, Stream<Servico> servicos, String imgven, String apelidoven, String emailven, String telefoneven) {
        this.idven = idven;
        this.nomeven = nomeven;
        this.ramo = ramo;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.star = star;
        this.servicos = servicos;
        this.imgven = imgven;
        this.apelidoven = apelidoven;
        this.emailven= emailven;
        this.telefoneven = telefoneven;
    }

  public String getEmailven() {
    return emailven;
  }

  public void setEmailven(String emailven) {
    this.emailven = emailven;
  }

  public String getTelefoneven() {
    return telefoneven;
  }

  public void setTelefoneven(String telefoneven) {
    this.telefoneven = telefoneven;
  }

  public Long getIdven() {
        return idven;
    }

    public void setIdven(Long idven) {
        this.idven = idven;
    }

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nomeven) {
        this.nomeven = nomeven;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

  public double getStar() {
    return star;
  }

  public void setStar(double star) {
    this.star = star;
  }

  public String getImgven() {
    return imgven;
  }

  public void setImgven(String imgven) {
    this.imgven = imgven;
  }

  public String getApelidoven() {
    return apelidoven;
  }

  public void setApelidoven(String apelidoven) {
    this.apelidoven = apelidoven;
  }

  public Stream<Servico> getServicos() {
    return servicos;
  }

  public void setServicos(Stream<Servico> servicos) {
    this.servicos = servicos;
  }
}
