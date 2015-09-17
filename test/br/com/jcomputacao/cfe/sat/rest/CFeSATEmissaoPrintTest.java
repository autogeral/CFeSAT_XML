package br.com.jcomputacao.cfe.sat.rest;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

/**
 *
 * @author murilo
 */
public class CFeSATEmissaoPrintTest {

    public static void main(String[] args) {
        try {
            String url = "http://AD01:8888/fiscal-sat/api/printer/status";
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
            //{"ovr":"0","offline":"0","wait":"0","bufStat":"00","pnes":"0","ps":"0","drawer":"1","noPaper":"0","error":"0","cover":"1","ca":"0","ce":"0","nre":"0","re":"0","hoh":"0","cmd":"0","firmwareVersion":"1.7"}

            //CFe35150982373077000171599000039370000235312876
            //CFe35150982373077000171599000039370000225029039
            //Cancelado!!
            //http://localhost:8080/fiscal-sat/api/venda/cancelamento/CFe35150982373077000171599000039370000248594026/print
            //String chave = "CFe35150982373077000171599000039370000248594026";
            String chave = "CFe35150905437537000137590000186980000015755974";
            url = "http://AD01:8888/fiscal-sat/api/cfe/" + chave + "/pdf";
            get = new GetMethod(url);
            r = client.executeMethod(get);
            System.out.println("Response code : " + r);
            input = get.getResponseBodyAsStream();
            File f = new File("CFeSAT.pdf");
            FileOutputStream fos = new FileOutputStream(f);
            while ((aByte = input.read()) != -1) {
                fos.write(aByte);
            }
            fos.flush();
            fos.close();
            bis.close();

            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            desktop.browse(f.toURI());
        } catch (IOException ex) {
            Logger.getLogger(CFeSATEmissaoPrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
