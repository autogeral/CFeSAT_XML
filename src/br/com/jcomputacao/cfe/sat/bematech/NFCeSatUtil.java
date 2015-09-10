package br.com.jcomputacao.cfe.sat.bematech;

/**
 * 10/09/2015 10:43:31
 * @author murilo
 */
public class NFCeSatUtil {
    
    public static String getAssinaturaAutomacaoComercial() {
        return "HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B/8BhmaBy55owBWkKXk6w8/nurdyFrJyfzz/xDghI91d/Tni95xljZwvL85VhsrUkAQF18u/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==";
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
