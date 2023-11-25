package br.com.mvv.aqceacha.repository.projections;

import java.util.Date;

public class VendedorRegistroDto {

    private String nomeven;

    private String emailven;

    private String senhaven;

    private String apelidoven;

    private Date nascimentoven;

    private String telefoneven;

    private String enderecoven;

    private String numeroven;

    private String complementoven;

    private String cnpj;

    private String documentoven;

    public String getDocumentoven() {
        return documentoven;
    }

    public void setDocumentoven(String documentoven) {
        this.documentoven = documentoven;
    }

    private Long idcidade;

    private Long idramo;

    public String getNomeven() {
        return nomeven;
    }

    public void setNomeven(String nomeven) {
        this.nomeven = nomeven;
    }

    public String getEmailven() {
        return emailven;
    }

    public void setEmailven(String emailven) {
        this.emailven = emailven;
    }

    public String getSenhaven() {
        return senhaven;
    }

    public void setSenhaven(String senhaven) {
        this.senhaven = senhaven;
    }

    public String getApelidoven() {
        return apelidoven;
    }

    public void setApelidoven(String apelidoven) {
        this.apelidoven = apelidoven;
    }

    public Date getNascimentoven() {
        return nascimentoven;
    }

    public void setNascimentoven(Date nascimentoven) {
        this.nascimentoven = nascimentoven;
    }

    public String getTelefoneven() {
        return telefoneven;
    }

    public void setTelefoneven(String telefoneven) {
        this.telefoneven = telefoneven;
    }

    public String getEnderecoven() {
        return enderecoven;
    }

    public void setEnderecoven(String enderecoven) {
        this.enderecoven = enderecoven;
    }

    public String getNumeroven() {
        return numeroven;
    }

    public void setNumeroven(String numeroven) {
        this.numeroven = numeroven;
    }

    public String getComplementoven() {
        return complementoven;
    }

    public void setComplementoven(String complementoven) {
        this.complementoven = complementoven;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(Long idcidade) {
        this.idcidade = idcidade;
    }

    public Long getIdramo() {
        return idramo;
    }

    public void setIdramo(Long idramo) {
        this.idramo = idramo;
    }
}
