package br.com.mvv.aqceacha.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table (name="ramoatv")
public class RamoAtv {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long idramo;
    private String ramo;
    private String iconramo;


    @JsonIgnore
    @OneToMany(mappedBy = "ramoatv")
    private List<RamoAtv> ramoatv = new ArrayList<>();

    public long getIdramo() {
        return idramo;
    }

    public void setIdramo(long idramo) {
        this.idramo = idramo;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public List<RamoAtv> getRamoatv() {
        return ramoatv;
    }

    public void setRamoatv(List<RamoAtv> ramoatv) {
        this.ramoatv = ramoatv;
    }

  public String getIconramo() {
    return iconramo;
  }

  public void setIconramo(String iconramo) {
    this.iconramo = iconramo;
  }

  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RamoAtv ramoAtv = (RamoAtv) o;
        return idramo == ramoAtv.idramo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idramo);
    }
}
