package br.com.mvv.aqceacha.repository.filter;

import br.com.mvv.aqceacha.model.Imagens;
import br.com.mvv.aqceacha.model.Servico;

import java.util.stream.Stream;

public class VendedorFilter {

    private String nomeven;

    private String ramo;

    private String nomecidade;

    private String uf;

    private Double star;
    private Stream<Servico> servicos;

    private String imgven;

    private String apelidoven;

    private String emailven;

    private String telefoneven;

    private Stream<Imagens> imagens;


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

    public Stream<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(Stream<Servico> servicos) {
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

    public Stream<Imagens> getImagens() {
        return imagens;
    }

    public void setImagens(Stream<Imagens> imagens) {
        this.imagens = imagens;
    }
}
