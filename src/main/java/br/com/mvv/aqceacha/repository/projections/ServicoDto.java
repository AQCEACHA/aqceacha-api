package br.com.mvv.aqceacha.repository.projections;

public class ServicoDto {

    private Long idserv;

    private String nomeserv;


    private Double precovenda;

    public ServicoDto(Long idserv, String nomeserv, Double precovenda) {
        this.idserv = idserv;
        this.nomeserv = nomeserv;
        this.precovenda = precovenda;
    }

  public Long getIdserv() {
    return idserv;
  }

  public void setIdserv(Long idserv) {
    this.idserv = idserv;
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
