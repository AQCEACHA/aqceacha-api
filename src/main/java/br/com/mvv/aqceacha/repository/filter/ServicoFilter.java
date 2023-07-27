package br.com.mvv.aqceacha.repository.filter;

public class ServicoFilter {

    private String nomeserv;

    private String ramo;

    private Double precovenda;

    public String getNomeserv() {
        return nomeserv;
    }

    public void setNomeserv(String nomeserv) {
        this.nomeserv = nomeserv;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        this.precovenda = precovenda;
    }

}
