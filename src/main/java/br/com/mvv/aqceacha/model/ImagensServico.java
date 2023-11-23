package br.com.mvv.aqceacha.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "imagensservico")
public class ImagensServico {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private long idimgserv;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "idimg")
  private Imagens imagens;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "idserv")
  private Servico servico;

  public long getIdimgven() {
    return idimgserv;
  }

  public void setIdimgven(long idimgven) {
    this.idimgserv = idimgven;
  }

  public Imagens getImagens() {
    return imagens;
  }

  public void setImagens(Imagens imagens) {
    this.imagens = imagens;
  }

  public Servico getServico() {
    return servico;
  }

  public void setServico(Servico servico) {
    this.servico = servico;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImagensServico that = (ImagensServico) o;
    return idimgserv == that.idimgserv;
  }

  @Override
  public int hashCode() {
    return Objects.hash(idimgserv);
  }
}
