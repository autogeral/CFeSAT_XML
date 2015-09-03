package br.com.jcomputacao.cfe.sat.rest;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

/**
 *
 * @author murilo
 */
public class CFeSATCancelamentoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String json = "{\n"
                    + "  \"ide\": {\n"
                    + "    \"numeroCaixa\": \"002\",\n"
                    + "    \"signAC\": \"SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT\",\n"
                    + "    \"CNPJ\": \"16716114000172\"\n"
                    + "  },\n"
                    + "  \"dest\": {\n"
                    + "    \"xNome\": \"BEMATECH S.A\",\n"
                    + "    \"CNPJ\": \"0000000000000\",\n"
                    + "    \"CPF\": \"00000000000\"\n"
                    + "  },\n"
                    + "  \"chCanc\": \"CFe35150982373077000171599000039370000225029039\"\n"
                    + "}";
            
            json = json.replace("\"CPF\": \"00000000000\"", "\"CPF\": \"27933992803\"").replace("    \"CNPJ\": \"0000000000000\",\n", "");
            
            String server = "localhost";
            String port = "8080";
            
            System.out.println(json);
            PostMethod post = new PostMethod("http://" + server + ":" + port + "/fiscal-sat/api/venda/cancelamento");
            RequestEntity requestEntity = new StringRequestEntity(json, "application/json", "UTF-8");
            post.setRequestHeader("Accept", "application/json");
            post.setRequestHeader("Content-type", "application/json");
            post.setRequestEntity(requestEntity);
            
            HttpClient client = new HttpClient();
            int r = client.executeMethod(post);
            System.out.println("Response code : " + r);
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
            //{"chave":"CFe35150982373077000171599000039370000248594026","codigoSefaz":"","dataProcessado":"2015-09-03T00:31:50.872-03:00","msgSefaz":"","tipoDocumento":"CANCELAMENTO","uuid":"cadc8a9b-5107-4ace-b4ee-740b39be2bd8","xmlEnvio":"<CFeCanc><infCFe chCanc=\"CFe35150982373077000171599000039370000225029039\"><ide><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><numeroCaixa>002</numeroCaixa></ide><dest><CPF>27933992803</CPF></dest></infCFe></CFeCanc>","xmlProcessado":"<CFeCanc><infCFe Id=\"CFe35150982373077000171599000039370000248594026\" chCanc=\"CFe35150982373077000171599000039370000225029039\" versao=\"0.06\"><dEmi>20150903</dEmi><hEmi>000729</hEmi><ide><cUF>35</cUF><cNF>859402</cNF><mod>59</mod><nserieSAT>900003937</nserieSAT><nCFe>000024</nCFe><dEmi>20150903</dEmi><hEmi>003329</hEmi><cDV>6</cDV><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><assinaturaQRCODE>PO+NOG6wB+x59d4uDiNkchu8vtUgQIscBcTkAdddVL5Zc+cp+K7W/QI4Fe8QyOCVs4NGRwEMM1jA/EwaWmZaVESG1EsbTDBtPdQvpvNC6fqDCyhXzXNK4GUY15tgXC0HZ4y9UdQD5Hfck8DdFrrf3x4whXTXQojDzmm1azB1P5/fYqOypPkadKXMHjGCEm3ljlvrsH/DuLmxqMahy0Bvdy/uOifCDoEZwn6UcVRJcKbXfT5fbC8UMMeRBicdBApplR/h4d6Ne/gvv/hGkXdU54gNEmV1uFmuRy0nHv4raMVa4QDyCX13UaFEcGvne5xt6Lj48Tzvk432QhOjkZPv5w==</assinaturaQRCODE><numeroCaixa>002</numeroCaixa></ide><emit><CNPJ>82373077000171</CNPJ><xNome>BEMATECH S.A</xNome><enderEmit><xLgr>RUI BARBOSA</xLgr><nro>2529</nro><xCpl>: MODULOS 06 07 E 08;</xCpl><xBairro>IPE</xBairro><xMun>SAO JOSE DOS PINHAIS</xMun><CEP>83055320</CEP></enderEmit><IE>111111111111</IE></emit><dest><CPF>27933992803</CPF></dest><total><vCFe>0.06</vCFe></total><infAdic><obsFisco xCampo=\"xCampo1\"><xTexto>xTexto1</xTexto></obsFisco></infAdic></infCFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></CanonicalizationMethod><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"></SignatureMethod><Reference URI=\"#CFe35150982373077000171599000039370000248594026\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"></Transform><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></Transform></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"></DigestMethod><DigestValue>t9okc1Xc5S8tRGZGZPsEP52hKAB3Fz2b94QsSc13QRE=</DigestValue></Reference></SignedInfo><SignatureValue>wa12k8YSTq5FheSs+psC4AtIQCYiYGCr5kM7jmn5kyJxsHnSFVb8pEf7so9DcbKJXlMXWTvQ1yuOTVxdKLZsgrP4Q0XfIP6Q+XC+YpAcIcCmMoFoZpAW5DJhE2HZIEMvWmFjTMdpYWeJazjwFJ7CUOZfhmnY0/UJWShO5stBlwrlz4R59zvUeRrFvWdlbsrv9N27c0F0p55pLS2V2tsBl0giXL0UYxoBe67FQnxamuUdhsUgkJ0f7Dz+D6nfZ78KilKfKFTzownjKAMFODOj5FyVQUcDWlGwTCCLhbW6AFO551A/I5WgvUxqtLqICUk2Q23xmhJg9Gt6E96OKtDFjQ==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></CFeCanc>"}
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CFeSATCancelamentoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CFeSATCancelamentoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
