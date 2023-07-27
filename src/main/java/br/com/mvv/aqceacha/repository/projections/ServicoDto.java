package br.com.mvv.aqceacha.repository.projections;

public class ServicoDto {

    private Long idserv;

    private String nomeserv;

    private String ramo;

    private Double precovenda;

    public ServicoDto(Long idserv, String nomeserv, String ramo, Double precovenda) {
        this.idserv = idserv;
        this.nomeserv = nomeserv;
        this.ramo = ramo;
        this.precovenda = precovenda;
    }

}
