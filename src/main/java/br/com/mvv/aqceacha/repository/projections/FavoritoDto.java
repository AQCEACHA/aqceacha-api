package br.com.mvv.aqceacha.repository.projections;

public class FavoritoDto {

    private Long idfav;

    private String nomeven;

    private String imgven;

    public FavoritoDto(Long idfav, String nomeven, String imgven){
        this.idfav = idfav;
        this.nomeven = nomeven;
        this.imgven = imgven;
    }

    public Long getIdfav() {
        return idfav;
    }

    public void setIdfav(Long idfav) {
        this.idfav = idfav;
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
