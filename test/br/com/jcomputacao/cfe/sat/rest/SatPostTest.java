package br.com.jcomputacao.cfe.sat.rest;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author murilo
 */
public class SatPostTest {

    public SatPostTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public static void main(String a[]) {
//    @Test
//    public void hello() {
        try {
            String json = "{\"dest\":{\"CPF\":\"27933992803\"}\n"
                    + " ,\"det\":[{\"nItem\":\"1\"\n"
                    + "         ,\"imposto\":\n"
                    + "		   {\"COFINS\":{\"COFINSNT\":{\"CST\":\"04\"}},\"ICMS\":{\"ICMS40\":{\"Orig\":\"0\",\"CST\":\"60\"}},\"PIS\":{\"PISNT\":{\"CST\":\"04\"}},\"vItem12741\":\"0.42\"},\"prod\":{\"CFOP\":\"5102\",\"NCM\":\"22011000\",\"cProd\":\"000001\",\"indRegra\":\"A\",\"qCom\":\"1.0000\",\"uCom\":\"UN\",\"vDesc\":\"0.00\",\"vUnCom\":\"0.06\",\"xProd\":\"Arruela Lisa 3/4\",\"vOutro\":\"0.00\"}}],\"emit\":{\"CNPJ\":\"05437537000137\",\"IE\":\"111111111111\",\"indRatISSQN\":\"N\",\"xNome\":\"AUTO GERAL DE ITU LTDA\",\"xFant\":\"AUTO GERAL LTDA\"},\"entrega\":null,\"ide\":{\"CNPJ\":\"16716114000172\",\"numeroCaixa\":\"002\",\"signAC\":\"SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT\"},\"total\":{\"vCFeLei12741\":\"0.00\"},\"pgto\":{\"MP\":[{\"cMP\":\"01\",\"vMP\":\"1.00\"}]},\"dataInserido\":\"31/08/2015 21:43:18\",\"infAdic\":{\"infCpl\":\"Obrigado, volte sempre\"},\"extratoResumido\":false}";

            String server = "localhost";
            String port = "8080";

            PostMethod post = new PostMethod("http://" + server + ":" + port + "/fiscal-sat/api/venda");
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
            
            String response = baos.toString();
            System.out.println(response);

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SatPostTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SatPostTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
