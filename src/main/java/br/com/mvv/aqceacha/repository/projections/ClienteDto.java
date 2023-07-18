package br.com.mvv.aqceacha.repository.projections;

public class ClienteDto {
    private Long idcli;

    private String nomecli;

    private String nomecidade;

    private String uf;

    public ClienteDto(Long idcli, String nomecli, String nomecidade, String uf) {
        this.idcli = idcli;
        this.nomecli = nomecli;
        this.nomecidade = nomecidade;
        this.uf = uf;
    }

    public Long getIdcli() {
        return idcli;
    }

    public void setIdcli(Long idcli) {
        this.idcli = idcli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
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
}
