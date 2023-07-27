package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idserv;

    private String nomeserv;

    private Double precovenda;

    private String imgserv;

    @JsonIgnore
    @OneToMany(mappedBy = "servico")
    private List<Servico> servico = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idramo")
    private RamoAtv ramoAtv;

    public long getIdserv() {
        return idserv;
    }

    public void setIdserv(long idserv) {
        this.idserv = idserv;
    }

    public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        this.precovenda = precovenda;
    }

    public String getImgserv() {
        return imgserv;
    }

    public void setImgserv(String imgserv) {
        this.imgserv = imgserv;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }

    public RamoAtv getRamoAtv() {
        return ramoAtv;
    }

    public void setRamoAtv(RamoAtv ramoAtv) {
        this.ramoAtv = ramoAtv;
    }

    public String getNomeserv() {
        return nomeserv;
    }

    public void setNomeserv(String nomeserv) {
        this.nomeserv = nomeserv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servico servico = (Servico) o;
        return idserv == servico.idserv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idserv);
    }
}
