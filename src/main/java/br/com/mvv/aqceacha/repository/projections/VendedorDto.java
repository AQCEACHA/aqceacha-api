package br.com.mvv.aqceacha.repository.projections;

import br.com.mvv.aqceacha.model.Imagens;
import br.com.mvv.aqceacha.model.RamoAtv;
import br.com.mvv.aqceacha.model.Servico;

import java.util.Arrays;
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

    private List<Servico> servicos;

    private String imgven;

    private String apelidoven;

    private String emailven;

    private String telefoneven;

    private List<Imagens> imagens;


    public VendedorDto(Long idven, String nomeven, String ramo, String nomecidade, String uf, Double star, List<Servico> servicos, String imgven, String apelidoven, String emailven, String telefoneven, List<Imagens> imagens) {
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
        this.imagens = imagens;
    }

  public VendedorDto(Long idven, String nomeven, String ramo, String nomecidade, String uf, Double star, Servico servicos, String imgven, String apelidoven, String emailven, String telefoneven, Imagens imagens) {
    this.idven = idven;
    this.nomeven = nomeven;
    this.ramo = ramo;
    this.nomecidade = nomecidade;
    this.uf = uf;
    this.star = star;
    this.servicos = Arrays.asList(servicos);;
    this.imgven = imgven;
    this.apelidoven = apelidoven;
    this.emailven= emailven;
    this.telefoneven = telefoneven;
    this.imagens = Arrays.asList(imagens);;
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

  public Double getStar() {
    return star;
  }

  public void setStar(Double star) {
    this.star = star;
  }

  public List<Servico> getServicos() {
    return servicos;
  }

  public void setServicos(List<Servico> servicos) {
    this.servicos = servicos;
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

  public List<Imagens> getImagens() {
    return imagens;
  }

  public void setImagens(List<Imagens> imagens) {
    this.imagens = imagens;
  }
}
