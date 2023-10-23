package br.com.mvv.aqceacha.repository.projections;

public class FavoritoDto {

    private Long idfav;

    private String nomeven;

    public FavoritoDto(Long idfav, String nomeven){
        this.idfav = idfav;
        this.nomeven = nomeven;
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
}
