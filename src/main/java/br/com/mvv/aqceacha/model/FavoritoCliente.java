package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "favoritocliente")
public class FavoritoCliente {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idfavcli;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idfav")
    private Favorito favorito;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idcli")
    private Cliente cliente;


    public long getIdfavcli() {
        return idfavcli;
    }

    public void setIdfavcli(long idfavcli) {
        this.idfavcli = idfavcli;
    }

    public Favorito getFavorito() {
        return favorito;
    }

    public void setFavorito(Favorito favorito) {
        this.favorito = favorito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoritoCliente that = (FavoritoCliente) o;
        return idfavcli == that.idfavcli;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfavcli);
    }
}
