package br.com.jcomputacao.cfe.sat.bematech.json;

import java.util.List;
import javax.xml.bind.annotation.XmlList;

/**
 * Utilizado para o retorno da consulta de status do aparelho do sat.<br/>
 * 09/09/2015 00:13:15<br/>
 *
 * @author murilo.lima
 */
public class StatusAparelhoSat {

    private String codigoRetorno;
    private String dataHoraAtual;
    private String ip;
    private String numeroSerie;
    private String online;
    private String statusLan;
    private String statusOperacao;
    private String ultimaComunicacaoSEFAZ;
    private String ultimaTransmissaoCFe;
    private String codigoMensagemSefaz;
    private String dataEmissaoCertificado;
    private String dataVencimentoCertificado;
    private String dnsPrimario;
    private String dnsSecundario;
    private String gateway;
    private String macAddress;
    private String mascaraRede;
    private String memoriaLivre;
    private String memoriaTotal;
    private String memoriaUtilizada;
    private String mensagemRetorno;
    private String mensagemSefaz;
    private String messageReturnDevice;
    private String nivelBateria;
    private String numeroSessao;
    private String primeiroCFeArmazenado;
    private String tipoLan;
    private String ultimoCFeArmazenado;
    private String ultimoCFeEnviado;
    private String versaoLayout;
    private String versaoSoftwareBasico;
    private String msgAlertaCFePendente;

    @XmlList
    private List<String> msgs;

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getDataHoraAtual() {
        return dataHoraAtual;
    }

    public void setDataHoraAtual(String dataHoraAtual) {
        this.dataHoraAtual = dataHoraAtual;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getStatusLan() {
        return statusLan;
    }

    public void setStatusLan(String statusLan) {
        this.statusLan = statusLan;
    }

    public String getStatusOperacao() {
        return statusOperacao;
    }

    public void setStatusOperacao(String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }

    public String getUltimaComunicacaoSEFAZ() {
        return ultimaComunicacaoSEFAZ;
    }

    public void setUltimaComunicacaoSEFAZ(String ultimaComunicacaoSEFAZ) {
        this.ultimaComunicacaoSEFAZ = ultimaComunicacaoSEFAZ;
    }

    public String getUltimaTransmissaoCFe() {
        return ultimaTransmissaoCFe;
    }

    public void setUltimaTransmissaoCFe(String ultimaTransmissaoCFe) {
        this.ultimaTransmissaoCFe = ultimaTransmissaoCFe;
    }

    public List<String> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }

    public String getCodigoMensagemSefaz() {
        return codigoMensagemSefaz;
    }

    public void setCodigoMensagemSefaz(String codigoMensagemSefaz) {
        this.codigoMensagemSefaz = codigoMensagemSefaz;
    }

    public String getDataEmissaoCertificado() {
        return dataEmissaoCertificado;
    }

    public void setDataEmissaoCertificado(String dataEmissaoCertificado) {
        this.dataEmissaoCertificado = dataEmissaoCertificado;
    }

    public String getDataVencimentoCertificado() {
        return dataVencimentoCertificado;
    }

    public void setDataVencimentoCertificado(String dataVencimentoCertificado) {
        this.dataVencimentoCertificado = dataVencimentoCertificado;
    }

    public String getDnsPrimario() {
        return dnsPrimario;
    }

    public void setDnsPrimario(String dnsPrimario) {
        this.dnsPrimario = dnsPrimario;
    }

    public String getDnsSecundario() {
        return dnsSecundario;
    }

    public void setDnsSecundario(String dnsSecundario) {
        this.dnsSecundario = dnsSecundario;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getMascaraRede() {
        return mascaraRede;
    }

    public void setMascaraRede(String mascaraRede) {
        this.mascaraRede = mascaraRede;
    }

    public String getMemoriaLivre() {
        return memoriaLivre;
    }

    public void setMemoriaLivre(String memoriaLivre) {
        this.memoriaLivre = memoriaLivre;
    }

    public String getMemoriaTotal() {
        return memoriaTotal;
    }

    public void setMemoriaTotal(String memoriaTotal) {
        this.memoriaTotal = memoriaTotal;
    }

    public String getMemoriaUtilizada() {
        return memoriaUtilizada;
    }

    public void setMemoriaUtilizada(String memoriaUtilizada) {
        this.memoriaUtilizada = memoriaUtilizada;
    }

    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    public void setMensagemRetorno(String mensagemRetorno) {
        this.mensagemRetorno = mensagemRetorno;
    }

    public String getMensagemSefaz() {
        return mensagemSefaz;
    }

    public void setMensagemSefaz(String mensagemSefaz) {
        this.mensagemSefaz = mensagemSefaz;
    }

    public String getMessageReturnDevice() {
        return messageReturnDevice;
    }

    public void setMessageReturnDevice(String messageReturnDevice) {
        this.messageReturnDevice = messageReturnDevice;
    }

    public String getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(String nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getNumeroSessao() {
        return numeroSessao;
    }

    public void setNumeroSessao(String numeroSessao) {
        this.numeroSessao = numeroSessao;
    }

    public String getPrimeiroCFeArmazenado() {
        return primeiroCFeArmazenado;
    }

    public void setPrimeiroCFeArmazenado(String primeiroCFeArmazenado) {
        this.primeiroCFeArmazenado = primeiroCFeArmazenado;
    }

    public String getTipoLan() {
        return tipoLan;
    }

    public void setTipoLan(String tipoLan) {
        this.tipoLan = tipoLan;
    }

    public String getUltimoCFeArmazenado() {
        return ultimoCFeArmazenado;
    }

    public void setUltimoCFeArmazenado(String ultimoCFeArmazenado) {
        this.ultimoCFeArmazenado = ultimoCFeArmazenado;
    }

    public String getUltimoCFeEnviado() {
        return ultimoCFeEnviado;
    }

    public void setUltimoCFeEnviado(String ultimoCFeEnviado) {
        this.ultimoCFeEnviado = ultimoCFeEnviado;
    }

    public String getVersaoLayout() {
        return versaoLayout;
    }

    public void setVersaoLayout(String versaoLayout) {
        this.versaoLayout = versaoLayout;
    }

    public String getVersaoSoftwareBasico() {
        return versaoSoftwareBasico;
    }

    public void setVersaoSoftwareBasico(String versaoSoftwareBasico) {
        this.versaoSoftwareBasico = versaoSoftwareBasico;
    }

    public String getMsgAlertaCFePendente() {
        return msgAlertaCFePendente;
    }

    public void setMsgAlertaCFePendente(String msgAlertaCFePendente) {
        this.msgAlertaCFePendente = msgAlertaCFePendente;
    }

    @Override
    public String toString() {
        return "StatusAparelhoSat{" + "codigoRetorno=" + codigoRetorno + "\n dataHoraAtual=" + dataHoraAtual
                + "\n ipSat=" + ip + "\n numeroSerie=" + numeroSerie + "\n online=" + online + "\n statusLan="
                + statusLan + "\n statusOperacao=" + statusOperacao + "\n ultimaComunicacaoSEFAZ="
                + ultimaComunicacaoSEFAZ + "\n ultimaTransmissaoCFe=" + ultimaTransmissaoCFe
                + (messageReturnDevice != null ? "\n messageReturnDevice=" + messageReturnDevice : "") + '}';
    }
}
