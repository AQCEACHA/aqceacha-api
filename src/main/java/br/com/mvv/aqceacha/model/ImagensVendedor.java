package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "imagensvendedor")
public class ImagensVendedor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idimgven;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idimg")
    private Imagens imagens;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idven")
    private Vendedor vendedor;


    public long getIdimgven() {
        return idimgven;
    }

    public void setIdimgven(long idimgven) {
        this.idimgven = idimgven;
    }

    public Imagens getImagens() {
        return imagens;
    }

    public void setImagens(Imagens imagens) {
        this.imagens = imagens;
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
        ImagensVendedor that = (ImagensVendedor) o;
        return idimgven == that.idimgven;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idimgven);
    }
}