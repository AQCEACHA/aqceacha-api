package br.com.mvv.aqceacha.repository.projections;

public class VendedorDto {

    private Long idven;

    private String nomeven;

    private String ramo;

    private String nomecidade;

    private String uf;

    private String nomeserv;

    public VendedorDto(Long idven, String nomeven, String ramo, String nomecidade, String uf, String nomeserv) {
        this.idven = idven;
        this.nomeven = nomeven;
        this.ramo = ramo;
        this.nomecidade = nomecidade;
        this.uf = uf;
        this.nomeserv = nomeserv;
    }

    public Long getIdven() {
        return idven;
    }

    public void setIdven(Long idven) {
        this.idven = idven;
    }

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nomeven) {
        this.nomeven = nomeven;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeserv() {
        return nomeserv;
    }

    public void setNomeserv(String nomeserv) {
        this.nomeserv = nomeserv;
    }
}
