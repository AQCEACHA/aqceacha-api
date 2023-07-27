package br.com.mvv.aqceacha.repository.projections;

import java.util.Date;

public class VendaDto {

    private Long idvenda;
    private Date datavenda;
    private String nomecli;
    private String nomeven;
    private String nomeserv;
    private Double precovenda;

    public VendaDto(Long idvenda, Date datavenda, String nomecli, String nomeven, String nomeserv, Double precovenda) {
        this.idvenda = idvenda;
        this.datavenda = datavenda;
        this.nomecli = nomecli;
        this.nomeven = nomeven;
        this.precovenda = precovenda;
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

    public String getNomeserv() {
        return nomeserv;
    }

    public void setNomeserv(String nomeserv) {
        this.nomeserv = nomeserv;
    }

    public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        this.precovenda = precovenda;
    }
}
