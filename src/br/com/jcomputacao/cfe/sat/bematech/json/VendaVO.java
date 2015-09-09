package br.com.jcomputacao.cfe.sat.bematech.json;

import java.util.List;
import javax.xml.bind.annotation.XmlList;

/**
 * Utilizado tanto para o retorno do envio quanto do cancelamento.<br/>
 * 09/09/2015 00:13:15<br/>
 * @author murilo
 */
public class VendaVO {

    private String sessao;
    private String tipoDocumento;
    private String uuid;
    private String chave;
    private String idPDV;
    private String codigoSefaz;
    private String codigoRetorno;
    private String msgSefaz;
    private String codigoErro;
    private String msgErro;
    private String xmlProcessado;
    private String xmlEnvio;
    private String dataProcessado;
    private String idQrCode;
    private String nserieSAT;
    private String nCFe;
    @XmlList
    private List<String> problemas;

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getIdPDV() {
        return idPDV;
    }

    public void setIdPDV(String idPDV) {
        this.idPDV = idPDV;
    }

    public String getCodigoSefaz() {
        return codigoSefaz;
    }

    public void setCodigoSefaz(String codigoSefaz) {
        this.codigoSefaz = codigoSefaz;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getMsgSefaz() {
        return msgSefaz;
    }

    public void setMsgSefaz(String msgSefaz) {
        this.msgSefaz = msgSefaz;
    }

    public String getCodigoErro() {
        return codigoErro;
    }

    public void setCodigoErro(String codigoErro) {
        this.codigoErro = codigoErro;
    }

    public String getMsgErro() {
        return msgErro;
    }

    public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
    }

    public String getXmlProcessado() {
        return xmlProcessado;
    }

    public void setXmlProcessado(String xmlProcessado) {
        this.xmlProcessado = xmlProcessado;
    }

    public String getXmlEnvio() {
        return xmlEnvio;
    }

    public void setXmlEnvio(String xmlEnvio) {
        this.xmlEnvio = xmlEnvio;
    }

    public String getDataProcessado() {
        return dataProcessado;
    }

    public void setDataProcessado(String dataProcessado) {
        this.dataProcessado = dataProcessado;
    }

    public String getIdQrCode() {
        return idQrCode;
    }

    public void setIdQrCode(String idQrCode) {
        this.idQrCode = idQrCode;
    }

    public String getNserieSAT() {
        return nserieSAT;
    }

    public void setNserieSAT(String nserieSAT) {
        this.nserieSAT = nserieSAT;
    }

    public String getnCFe() {
        return nCFe;
    }

    public void setnCFe(String nCFe) {
        this.nCFe = nCFe;
    }

    public List<String> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<String> problemas) {
        this.problemas = problemas;
    }

    @Override
    public String toString() {
        return "VendaVO{" + "sessao=" + sessao + ", tipoDocumento=" + tipoDocumento + ", uuid=" + uuid + ", chave=" + chave + ", idPDV=" + idPDV + ", codigoSefaz=" + codigoSefaz + ", codigoRetorno=" + codigoRetorno + ", msgSefaz=" + msgSefaz + ", codigoErro=" + codigoErro + ", msgErro=" + msgErro + ", xmlProcessado=" + xmlProcessado + ", xmlEnvio=" + xmlEnvio + ", dataProcessado=" + dataProcessado + ", idQrCode=" + idQrCode + ", nserieSAT=" + nserieSAT + ", nCFe=" + nCFe + ", problemas=" + problemas + '}';
    }
}
