package br.com.mvv.aqceacha.model.repository.filter;

import java.util.Date;

public class VendaFilter {

    private Date datavenda;

    private String nomecli;

    private String nomeven;

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nomeven) {
        this.nomeven = nomeven;
    }
}
