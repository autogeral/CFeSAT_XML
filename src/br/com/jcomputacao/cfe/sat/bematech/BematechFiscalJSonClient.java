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
 *
 * @author murilo
 */
public class BematechFiscalJSonClient {

    private final String host;
    private final int port;
    private String response;
    private byte[] content;

    public BematechFiscalJSonClient(String server, int port) {
        this.host = server;
        this.port = port;
    }

    public int validar(String json) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda/validar";
        return executePost(url, json);
    }

    public int transmitir(String json) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda";
        return executePost(url, json);
    }

    public int cancelar(String json) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/venda/cancelamento";
        return executePost(url, json);
    }
    
    private int executePost(String url, String json) throws IOException {
        System.out.println("POST : " + url);
        PostMethod post = new PostMethod(url);
        RequestEntity requestEntity = new StringRequestEntity(json, "application/json", "UTF-8");
        post.setRequestHeader("Accept", "application/json");
        post.setRequestHeader("Content-type", "application/json");
        post.setRequestEntity(requestEntity);

        HttpClient client = new HttpClient();
        int r = client.executeMethod(post);

        InputStream input = post.getResponseBodyAsStream();
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

    public int impressao(String chave) throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/cfe/" + chave + "/pdf";
        System.out.println("GET : " + url);
        GetMethod get = new GetMethod(url);
        HttpClient client = new HttpClient();
        int r = client.executeMethod(get);

        InputStream input = get.getResponseBodyAsStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int aByte;
        while ((aByte = input.read()) != -1) {
            baos.write(aByte);
        }
        baos.flush();
        baos.close();
        input.close();
        content = baos.toByteArray();
        response = null;
        return r;
    }

    public int statusImpressora() throws IOException {
        String url = "http://" + host + ":" + port + "/fiscal-sat/api/printer/status";
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

    public String getResponse() {
        return response;
    }

    public byte[] getContent() {
        return content;
    }
}
