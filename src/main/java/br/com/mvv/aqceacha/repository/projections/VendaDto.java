package br.com.mvv.aqceacha.repository.projections;

import java.util.Date;

public class VendaDto {

    private Long idvenda;
    private Date datavenda;
    private Long nomecli;
    private Long nomeven;
    //private Double precovenda;

    public VendaDto(Long idvenda, Date datavenda, Long nomecli, Long nomeven /*, Double precovenda*/) {
        this.idvenda = idvenda;
        this.datavenda = datavenda;
        this.nomecli = nomecli;
        this.nomeven = nomeven;
        //this.precovenda = precovenda;
    }

    public Long getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Long idvenda) {
        this.idvenda = idvenda;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public Long getNomecli() {
        return nomecli;
    }

    public void setNomecli(Long nomecli) {
        this.nomecli = nomecli;
    }

    public Long getNomeven() {
        return nomeven;
    }

    public void setNomeven(Long nomeven) {
        this.nomeven = nomeven;
    }

    /*public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        this.precovenda = precovenda;
    }*/
}
