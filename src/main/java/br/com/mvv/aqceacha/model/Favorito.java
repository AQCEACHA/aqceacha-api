package br.com.mvv.aqceacha.model;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "favorito")
public class Favorito {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idfav;

    @ManyToOne
    @JoinColumn(name = "idven")
    private Vendedor vendedor;

    public long getIdfav() {
        return idfav;
    }

    public void setIdfav(long idfav) {
        this.idfav = idfav;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorito favorito = (Favorito) o;
        return idfav == favorito.idfav;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfav);
    }
}
