package br.com.jcomputacao.cfe.sat.bematech;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 * 22/09/2015 11:33:34
 * 
 * http://localhost:21212/fiscal-sat/docs/ para acesso a API Rest para 
 * operações com o Fiscal Manager SAT Bematech
 *
 * @author murilo
 */
public class BematechFiscalXmlClient {

    private final String host;
    private final int port;
    private String response;
    private byte[] content;

    public BematechFiscalXmlClient(String server, int port) {
        this.host = server;
        this.port = port;
    }

    public String getResponse() {
        return response;
    }

    public byte[] getContent() {
        return content;
    }

    public int transmitir(String xml) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda";
        return executePost(url, xml);
    }
    
    public int validar(String xml) throws IOException {
        //String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda/validar";
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/operacoes/validar/xml";
        return executePost(url, xml);
    }

    public int cancelar(String xml) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda/cancelamento";
        return executePost(url, xml);
    }

    private int executePost(String url, String xml) throws IOException {
        System.out.println("POST : " + url);
        PostMethod post = new PostMethod(url);
        RequestEntity requestEntity = new StringRequestEntity(xml, "application/xml", "UTF-8");
        post.setRequestHeader("Accept", "application/xml");
        post.setRequestHeader("Accept", "application/json");
        post.setRequestHeader("Content-type", "application/xml");
        //post.setRequestHeader("Content-type", "application/vnd+bematech.operacao-v1+xml");
        post.setRequestEntity(requestEntity);

        HttpClient client = new HttpClient();
        int r = client.executeMethod(post);
        

        ByteArrayOutputStream baos;
        try (InputStream input = post.getResponseBodyAsStream()) {
            baos = new ByteArrayOutputStream();
            try (BufferedInputStream bis = new BufferedInputStream(input)) {
                int aByte;
                while ((aByte = bis.read()) != -1) {
                    baos.write(aByte);
                }
                baos.flush();
                baos.close();
            }
        }

        response = baos.toString();
        //response = post.getResponseBodyAsString();
        content = null;
        return r;
    }
    
    public int statusSat() throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/sat/status";
        return executeGet(url);
    }
    
    public int configuracaoInfoSat() throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/configuracao/info";
        return executeGet(url);
    }

    private int executeGet(String url) throws IOException {
        GetMethod get = new GetMethod(url);

        HttpClient client = new HttpClient();
        System.out.println("GET : " + url);
        int r = client.executeMethod(get);

        InputStream input = get.getResponseBodyAsStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedInputStream bis = new BufferedInputStream(input);
        int aByte;
        while ((aByte = bis.read()) != -1) {
            baos.write(aByte);
        }
        baos.flush();
        baos.close();
        bis.close();

        response = baos.toString();
        content = null;
        return r;
    }
}
