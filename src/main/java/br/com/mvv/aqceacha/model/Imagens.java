package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "imagens")
public class Imagens {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private long idimg;

  private String img;

  @OneToMany(mappedBy = "imagens")
  private List<ImagensServico> imagensServicos = new ArrayList<>();

  public long getIdimg() {
    return idimg;
  }

  public void setIdimg(long idimg) {
    this.idimg = idimg;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public List<ImagensServico> getImagensServicos() {
    return imagensServicos;
  }

  public void setImagensServicos(List<ImagensServico> imagensServicos) {
    this.imagensServicos = imagensServicos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Imagens imagens = (Imagens) o;
    return idimg == imagens.idimg;
  }

  @Override
  public int hashCode() {
    return Objects.hash(idimg);
  }
}
