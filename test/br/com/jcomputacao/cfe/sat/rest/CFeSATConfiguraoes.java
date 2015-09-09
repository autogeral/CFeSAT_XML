package br.com.jcomputacao.cfe.sat.rest;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 * 08/09/2015 19:55:53
 * @author murilo
 */
public class CFeSATConfiguraoes {
    
    public static void main(String[] args) {
        try {
            String url = "http://ad01:8888/fiscal-sat/api/configuracao/info";
            GetMethod get = new GetMethod(url);

            HttpClient client = new HttpClient();
            int r = client.executeMethod(get);
            System.out.println("Response code : " + r);
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

            String response = baos.toString();
            System.out.println(response);

        } catch (IOException ex) {
            Logger.getLogger(CFeSATEmissaoPrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
