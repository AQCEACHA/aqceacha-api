package br.com.mvv.aqceacha.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "servicovendedor")
public class ServicoVendedor {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private long id;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "idserv")
  private Servico servico;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "idven")
  private Vendedor vendedor;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Servico getServico() {
    return servico;
  }

  public void setServico(Servico servico) {
    this.servico = servico;
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
    ServicoVendedor that = (ServicoVendedor) o;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
