package br.com.mvv.aqceacha.model;

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
  private List<ImagensVendedor> imagensVendedor = new ArrayList<>();

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

  public List<ImagensVendedor> getImagensVendedor() {
    return imagensVendedor;
  }

  public void setImagensVendedor(List<ImagensVendedor> imagensVendedor) {
    this.imagensVendedor = imagensVendedor;
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
