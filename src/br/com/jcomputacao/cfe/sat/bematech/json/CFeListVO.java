package br.com.jcomputacao.cfe.sat.bematech.json;

/**
 * 09/09/2015 00:15:40
 * @author murilo
 */
public class CFeListVO {

    private String dataProcessado;
    private String dataEnvio;
    private String numeroExtrato;
    private String numeroSAT;
    private String numeroCaixa;
    private String idPDV;
    private String chave;
    private String total;
    private String errorCode;
    private String errorMsg;
    private String status;
    private String sessao;

    public String getDataProcessado() {
        return dataProcessado;
    }

    public void setDataProcessado(String dataProcessado) {
        this.dataProcessado = dataProcessado;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getNumeroExtrato() {
        return numeroExtrato;
    }

    public void setNumeroExtrato(String numeroExtrato) {
        this.numeroExtrato = numeroExtrato;
    }

    public String getNumeroSAT() {
        return numeroSAT;
    }

    public void setNumeroSAT(String numeroSAT) {
        this.numeroSAT = numeroSAT;
    }

    public String getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(String numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public String getIdPDV() {
        return idPDV;
    }

    public void setIdPDV(String idPDV) {
        this.idPDV = idPDV;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "CFeListVO{" + "dataProcessado=" + dataProcessado + ", dataEnvio=" + dataEnvio + ", numeroExtrato=" + numeroExtrato + ", numeroSAT=" + numeroSAT + ", numeroCaixa=" + numeroCaixa + ", idPDV=" + idPDV + ", chave=" + chave + ", total=" + total + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg + ", status=" + status + ", sessao=" + sessao + '}';
    }

}
