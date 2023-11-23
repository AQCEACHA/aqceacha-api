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
    private String imgven;
    private String publiimg;
    @Column(unique=true)
    private String emailven;
    private String senhaven;
    private String apelidoven;
    private Date nascimentoven;
    private String telefoneven;
    private String enderecoven;
    private String numeroven;
    private String complementoven;
    private String documentoven;
    private String cnpj;
    private Double star;


    @ManyToOne
    @JoinColumn(name = "idcidade")
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "idramo")
    private RamoAtv ramoatv;


    @OneToMany(mappedBy = "vendedor")
    private List<ServicoVendedor> servicovendedor = new ArrayList<>();

    public long getIdven() {
        return idven;
    }

    public void setIdven(long idven) {
        this.idven = idven;
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

    public String getPubliimg() {
        return publiimg;
    }

    public void setPubliimg(String publiimg) {
        this.publiimg = publiimg;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNumeroven() {
        return numeroven;
    }

    public void setNumeroven(String numeroven) {
        this.numeroven = numeroven;
    }

    public List<ServicoVendedor> getServicosVendedor() {
        return servicovendedor;
    }

    public void setServicosVendedor(List<ServicoVendedor> servicovendedor) {
        this.servicovendedor = servicovendedor;
    }

  public Double getStar() {
    return star;
  }

  public void setStar(Double star) {
    this.star = star;
  }

  public RamoAtv getRamoatv() {
    return ramoatv;
  }

  public void setRamoatv(RamoAtv ramoatv) {
    this.ramoatv = ramoatv;
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
