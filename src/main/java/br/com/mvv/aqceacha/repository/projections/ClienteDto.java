package br.com.mvv.aqceacha.repository.projections;

public class ClienteDto {
    private Long idcli;

    private String nomecli;

    private String nomecidade;

    private String uf;

    private String nomeven;

    private String imgven;

    public ClienteDto(Long idcli, String nomecli, String nomecidade, String uf, String nomeven, String imgven) {
        this.idcli = idcli;
        this.nomecli = nomecli;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.nomeven = nomeven;
        this.imgven = imgven;
    }

    public Long getIdcli() {
        return idcli;
    }

    public void setIdcli(Long idcli) {
        this.idcli = idcli;
    }

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
