package br.com.mvv.aqceacha.repository.filter;

public class VendedorFilter {

    private String nomeven;

    private String ramo;

    private String nomecidade;

    private String uf;

    private Double star;

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
}
