package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Objects;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name="venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idvenda;
    private Date datavenda;

    @JsonIgnore
    @OneToMany(mappedBy = "venda")
    private List<Venda> venda = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idcli")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idven")
    private Vendedor vendedor;

    public long getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(long idvenda) {
        this.idvenda = idvenda;
    }

    public List<Venda> getVenda() {
        return venda;
    }

    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return idvenda == venda.idvenda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idvenda);
    }
}