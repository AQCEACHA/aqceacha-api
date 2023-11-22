package br.com.mvv.aqceacha.repository.filter;

public class ClienteFilter {

    private String nomecli;

    private String nomecidade;

    private String uf;

    private String nomeven;

    private String imgven;

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
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

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nomeven) {
        this.nomeven = nomeven;
    }

  public String getImgven() {
    return imgven;
  }

  public void setImgven(String imgven) {
    this.imgven = imgven;
  }
}
