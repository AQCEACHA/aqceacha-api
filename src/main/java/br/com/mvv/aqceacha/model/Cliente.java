package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idcli;
    private String nomecli;
    @Column(unique=true)
    private String emailcli;
    private String senhacli;
    private String apelidocli;
    private Date nascimentocli;
    private String telefonecli;
    private String enderecocli;
    private String numerocli;
    private String complementocli;
    private String documentocli;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Venda> clientevenda = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "idcidade")
    private Cidade cidade;

    public long getIdcli() {
        return idcli;
    }

    public void setIdcli(long idcli) {
        this.idcli = idcli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String namecli) {
        this.nomecli = namecli;
    }

    public List<Venda> getClientevenda() {
        return clientevenda;
    }

    public void setClientevenda(List<Venda> clientevenda) {
        this.clientevenda = clientevenda;
    }


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }

    public String getSenhacli() {
        return senhacli;
    }

    public void setSenhacli(String senhacli) {
        this.senhacli = senhacli;
    }

    public String getApelidocli() {
        return apelidocli;
    }

    public void setApelidocli(String apelidocli) {
        this.apelidocli = apelidocli;
    }

    public Date getNascimentocli() {
        return nascimentocli;
    }

    public void setNascimentocli(Date nascimentocli) {
        this.nascimentocli = nascimentocli;
    }

    public String getTelefonecli() {
        return telefonecli;
    }

    public void setTelefonecli(String telefonecli) {
        this.telefonecli = telefonecli;
    }

    public String getEnderecocli() {
        return enderecocli;
    }

    public void setEnderecocli(String enderecocli) {
        this.enderecocli = enderecocli;
    }

    public String getComplementocli() {
        return complementocli;
    }

    public void setComplementocli(String complementocli) {
        this.complementocli = complementocli;
    }

    public String getDocumentocli() {
        return documentocli;
    }

    public void setDocumentocli(String documentocli) {
        this.documentocli = documentocli;
    }

    public String getNumerocli() {
        return numerocli;
    }

    public void setNumerocli(String numerocli) {
        this.numerocli = numerocli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idcli == cliente.idcli;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcli);
    }
}
