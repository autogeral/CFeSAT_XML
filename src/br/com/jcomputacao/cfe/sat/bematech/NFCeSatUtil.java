package br.com.jcomputacao.cfe.sat.bematech;

/**
 * 10/09/2015 10:43:31
 * @author murilo
 */
public class NFCeSatUtil {
    
    public static String getAssinaturaAutomacaoComercial(String cnpj) {
        String key = "sat.signAC";
        String value = System.getProperty(cnpj + "." + key);
        if (value != null) {
            return value;
        }
        return System.getProperty(key);
    }
    
    public static String getServidorHost(String cnpj){
        String key = "sat.server.host";
        String value = System.getProperty(cnpj + "." + key);
        if (value != null) {
            return value;
        }
        return System.getProperty(key, "localhost");
    }
    
    public static String getServidorPorta(String cnpj){
        String key = "sat.server.port";
        String value = System.getProperty(cnpj + "." + key);
        if (value != null) {
            return value;
        }
        return System.getProperty(key, "8888");
    }

}
