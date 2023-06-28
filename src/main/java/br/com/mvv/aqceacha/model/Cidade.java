package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name="cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idcidade;
    private String nomecidade;
    private String uf;

    @JsonIgnore
    @OneToMany(mappedBy = "cidade")
    private List<Cidade> cidade = new ArrayList<>();

    public long getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(long idcidade) {
        this.idcidade = idcidade;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public List<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return idcidade == cidade.idcidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcidade);
    }
}

