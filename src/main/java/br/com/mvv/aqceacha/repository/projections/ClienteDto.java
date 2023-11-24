package br.com.mvv.aqceacha.repository.projections;

import br.com.mvv.aqceacha.model.Favorito;
import br.com.mvv.aqceacha.model.Imagens;

import java.util.List;
import java.util.stream.Stream;

public class ClienteDto {
    private Long idcli;

    private String nomecli;

    private String nomecidade;

    private String uf;

    private List<Favorito> favorito;

  public ClienteDto(Long idcli, String nomecli, String nomecidade, String uf, List<Favorito> favorito
  ) {
    this.idcli = idcli;
    this.nomecli = nomecli;
    this.nomecidade = nomecidade;
    this.uf = uf;
    this.favorito = favorito;

  }

    public ClienteDto(Long idcli, String nomecli, String nomecidade, String uf, Favorito favorito
    ) {
        this.idcli = idcli;
        this.nomecli = nomecli;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.favorito = List.of(favorito);

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

    public List<Favorito> getFavorito() {
        return favorito;
    }

    public void setFavorito(List<Favorito> favorito) {
        this.favorito = favorito;
    }
}
