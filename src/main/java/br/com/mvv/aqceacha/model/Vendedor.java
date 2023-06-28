package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name = "vendedor")

public class Vendedor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idven;
    private String nomeven;
    private String emailven;
    private String senhaven;
    private String apelidoven;
    private Date nascimentoven;
    private String generoven;
    private String telefoneven;
    private String enderecoven;
    private String complementoven;
    private String documentoven;
    private String comprovven;

    @JsonIgnore
    @OneToMany(mappedBy = "vendedor")
    private List<Venda> vendedorvenda = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idcidade")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "idramo")
    private RamoAtv ramoAtv;

    public long getIdven() {
        return idven;
    }

    public void setIdven(long idven) {
        this.idven = idven;
    }

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nameven) {
        this.nomeven = nameven;
    }

    public String getEmailven() {
        return emailven;
    }

    public void setEmailven(String emailven) {
        this.emailven = emailven;
    }

    public String getSenhaven() {
        return senhaven;
    }

    public void setSenhaven(String senhaven) {
        this.senhaven = senhaven;
    }

    public String getApelidoven() {
        return apelidoven;
    }

    public void setApelidoven(String apelidoven) {
        this.apelidoven = apelidoven;
    }

    public Date getNascimentoven() {
        return nascimentoven;
    }

    public void setNascimentoven(Date nascimentoven) {
        this.nascimentoven = nascimentoven;
    }

    public String getGeneroven() {
        return generoven;
    }

    public void setGeneroven(String generoven) {
        this.generoven = generoven;
    }

    public String getTelefoneven() {
        return telefoneven;
    }

    public void setTelefoneven(String telefoneven) {
        this.telefoneven = telefoneven;
    }

    public String getEnderecoven() {
        return enderecoven;
    }

    public void setEnderecoven(String enderecoven) {
        this.enderecoven = enderecoven;
    }

    public String getComplementoven() {
        return complementoven;
    }

    public void setComplementoven(String complementoven) {
        this.complementoven = complementoven;
    }

    public String getDocumentoven() {
        return documentoven;
    }

    public void setDocumentoven(String documentoven) {
        this.documentoven = documentoven;
    }

    public String getComprovven() {
        return comprovven;
    }

    public void setComprovven(String comprovven) {
        this.comprovven = comprovven;
    }

    public List<Venda> getVendedorvenda() {
        return vendedorvenda;
    }

    public void setVendedorvenda(List<Venda> vendedorvenda) {
        this.vendedorvenda = vendedorvenda;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public RamoAtv getRamoAtv() {
        return ramoAtv;
    }

    public void setRamoAtv(RamoAtv ramoAtv) {
        this.ramoAtv = ramoAtv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return idven == vendedor.idven;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idven);
    }
}
