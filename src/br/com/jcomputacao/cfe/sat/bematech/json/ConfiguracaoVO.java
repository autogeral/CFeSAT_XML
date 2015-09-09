package br.com.jcomputacao.cfe.sat.bematech.json;

/**
 * 09/09/2015 00:12:43
 * @author murilo
 */
public class ConfiguracaoVO {

    private String versao;
    private String modulo;
    private String nome;
    private String serial;
    private boolean licenciado;
    private String validadeLicenca;

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

    public boolean isLicenciado() {
        return licenciado;
    }

    public void setLicenciado(boolean licenciado) {
        this.licenciado = licenciado;
    }

    public String getValidadeLicenca() {
        return validadeLicenca;
    }

    public void setValidadeLicenca(String validadeLicenca) {
        this.validadeLicenca = validadeLicenca;
    }

    @Override
    public String toString() {
        return "ConfiguracaoVO{" + "versao=" + versao + ", modulo=" + modulo + ", nome=" + nome + ", serial=" + serial + ", licenciado=" + licenciado + ", validadeLicenca=" + validadeLicenca + '}';
    }

}
