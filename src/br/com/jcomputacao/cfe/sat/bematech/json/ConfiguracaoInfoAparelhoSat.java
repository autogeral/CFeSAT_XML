package br.com.jcomputacao.cfe.sat.bematech.json;

/**
 * Utilizado para o retorno da consulta de informações de configuração do
 * aparelho do sat.<br/>
 * 29/08/2016 16:59:15<br/>
 *
 * @author murilo.lima
 */
public class ConfiguracaoInfoAparelhoSat {

    private String versao;
    private String modulo;
    private String nome;
    private String serial;
    private String licenciado;
    private String validadeLicenca;
    private String CNPJ;
    private String vecf;
    private String msg;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getLicenciado() {
        return licenciado;
    }

    public void setLicenciado(String licenciado) {
        this.licenciado = licenciado;
    }

    public String getValidadeLicenca() {
        return validadeLicenca;
    }

    public void setValidadeLicenca(String validadeLicenca) {
        this.validadeLicenca = validadeLicenca;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getVecf() {
        return vecf;
    }

    public void setVecf(String vecf) {
        this.vecf = vecf;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    @Override
    public String toString() {
        return "ConfiguracaoInfoAparelhoSat{" + "versao=" + versao + "\n modulo=" + modulo + "\n nome=" + nome + "\n serial=" + serial + "\n licenciado=" + licenciado + "\n validadeLicenca=" + validadeLicenca + "\n CNPJ=" + CNPJ + "\n vecf=" + vecf + '}';
    }

}
