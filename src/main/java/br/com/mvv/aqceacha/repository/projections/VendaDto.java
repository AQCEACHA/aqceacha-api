package br.com.mvv.aqceacha.repository.projections;

import java.util.Date;

public class VendaDto {

    private Long idvenda;
    private Date datavenda;
    private Long idcli;
    private Long idven;
    private Double precovenda;

    public VendaDto(Long idvenda, Date datavenda, Long idcli, Long idven) {
        this.idvenda = idvenda;
        this.datavenda = datavenda;
        this.idcli = idcli;
        this.idven = idven;
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

    public Long getIdcli() {
        return idcli;
    }

    public void setIdcli(Long idcli) {
        this.idcli = idcli;
    }

    public Long getIdven() {
        return idven;
    }

    public void setIdven(Long idven) {
        this.idven = idven;
    }

}
