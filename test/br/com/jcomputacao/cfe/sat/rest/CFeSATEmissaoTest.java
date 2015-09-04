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
public class CFeSATEmissaoTest {

    public CFeSATEmissaoTest() {
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
            String json = 
                      "{\"dest\":{\"CPF\":\"27933992803\"},\n"
                    + " \"det\":["
                    + "          {\"nItem\":\"1\"\n"
                    + "         ,\"imposto\":\n"
                    + "		   {\"COFINS\":{\"COFINSNT\":{\"CST\":\"04\"}},\n"
                    + "             \"ICMS\":  {\"ICMS40\":{\"Orig\":\"0\",\"CST\":\"60\"}},\n"
                    + "             \"PIS\":{\"PISNT\":{\"CST\":\"04\"}},\n"
                    + "             \"vItem12741\":\"0.42\"}\n"
                    + "         ,\"prod\":{\"CFOP\":\"5102\",\n"
                    + "                    \"NCM\":\"22011000\",\n"
                    + "                    \"cProd\":\"000001\",\n"
                    + "                    \"indRegra\":\"A\",\n"
                    + "                    \"qCom\":\"1.0000\",\n"
                    + "                    \"uCom\":\"UN\",\n"
                    + "                    \"vDesc\":\"0.00\",\n"
                    + "                    \"vUnCom\":\"0.06\",\n"
                    + "                    \"xProd\":\"Arruela Lisa 3/4\",\n"
                    + "                    \"vOutro\":\"0.00\"}"
                    + "            }\n"
                    + "         ],\n"
                    + " \"emit\":{\"CNPJ\":\"05437537000137\",\n"
                    + "           \"IE\":\"111111111111\",\n"
                    + "           \"indRatISSQN\":\"N\",\n"
                    + "           \"xNome\":\"AUTO GERAL DE ITU LTDA\",\n"
                    + "           \"xFant\":\"AUTO GERAL LTDA\"},\n"
                    + " \"entrega\":null,\n"
                    + " \"ide\":{\"CNPJ\":\"16716114000172\",\n"
                    + " \"numeroCaixa\":\"001\",\n"
                    + " \"signAC\":\"SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT\"},\n"
                    + " \"total\":{\"vCFeLei12741\":\"0.00\"},\n"
                    + "\"pgto\":{\"MP\":[{\"cMP\":\"01\",\"vMP\":\"1.00\"}]},\n"
                    + "\"dataInserido\":\"31/08/2015 21:43:18\",\n"
                    + "\"infAdic\":{\"infCpl\":\"Obrigado, volte sempre\"},\n"
                    + "             \"extratoResumido\":false}";

            String server = "localhost";
            String port = "8080";

            PostMethod post = new PostMethod("http://" + server + ":" + port + "/fiscal-sat/api/venda");
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
            //{"chave":"CFe35150982373077000171599000039370000225029039","codigoSefaz":"","dataProcessado":"2015-09-03T00:05:50.927-03:00","idPDV":"PDV001","idQrCode":"qa2++21t8PiO6OZmt99DJYUpBtyMVNFc/cGQiPN/GvYN9mnHzfkx22XpI6Fzsa9836i3lRMY1Wpe/19tBZsC9VJkMyESB6NW0i6Z7BraYwyUhldRatUG7iSjq+8uc7lcVRQfg44oW6Vp3E+DwYVBBJ9KeNkyv+0z8Gz/GErGPbG1E27NkcCrAcI2FSzjQ+/68hPZ2GIOOokkM+4nDdFWE4yFI8RxxiwiDAdKCiVJnVbuWRDPdE8roaEDvIMFar5s1cXixPG72I76eBl95X7/1kwdc2Bgx+PWIGIgAroVeT2lMYFaqXe4VShuOM47OXvVh4d93X6H1zIfR/4732YMtg==","msgSefaz":"","nserieSAT":"900003937","sessao":"439568","tipoDocumento":"VENDA","uuid":"f77fa1d4-7abf-4fa8-9031-094f8ae0319f","xmlEnvio":"<CFe><infCFe versaoDadosEnt=\"00.06\"><ide><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><numeroCaixa>002</numeroCaixa></ide><emit><CNPJ>82373077000171</CNPJ><IE>111111111111</IE><indRatISSQN>N</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\"1\"><prod><cProd>000001</cProd><xProd>Arruela Lisa 3/4</xProd><NCM>22011000</NCM><CFOP>5102</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><indRegra>A</indRegra><vDesc>0.00</vDesc><vOutro>0.00</vOutro></prod><imposto><vItem12741>0.42</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><vCFeLei12741>0.00</vCFeLei12741></total><pgto><MP><cMP>01</cMP><vMP>1.00</vMP></MP></pgto><infAdic><infCpl>Obrigado, volte sempre</infCpl></infAdic></infCFe></CFe>","xmlProcessado":"<CFe><infCFe Id=\"CFe35150982373077000171599000039370000225029039\" versao=\"0.06\" versaoDadosEnt=\"00.06\" versaoSB=\"010000\"><ide><cUF>35</cUF><cNF>502903</cNF><mod>59</mod><nserieSAT>900003937</nserieSAT><nCFe>000022</nCFe><dEmi>20150903</dEmi><hEmi>000729</hEmi><cDV>9</cDV><tpAmb>2</tpAmb><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><assinaturaQRCODE>qa2++21t8PiO6OZmt99DJYUpBtyMVNFc/cGQiPN/GvYN9mnHzfkx22XpI6Fzsa9836i3lRMY1Wpe/19tBZsC9VJkMyESB6NW0i6Z7BraYwyUhldRatUG7iSjq+8uc7lcVRQfg44oW6Vp3E+DwYVBBJ9KeNkyv+0z8Gz/GErGPbG1E27NkcCrAcI2FSzjQ+/68hPZ2GIOOokkM+4nDdFWE4yFI8RxxiwiDAdKCiVJnVbuWRDPdE8roaEDvIMFar5s1cXixPG72I76eBl95X7/1kwdc2Bgx+PWIGIgAroVeT2lMYFaqXe4VShuOM47OXvVh4d93X6H1zIfR/4732YMtg==</assinaturaQRCODE><numeroCaixa>002</numeroCaixa></ide><emit><CNPJ>82373077000171</CNPJ><xNome>BEMATECH S.A</xNome><enderEmit><xLgr>RUI BARBOSA</xLgr><nro>2529</nro><xCpl>: MODULOS 06 07 E 08;</xCpl><xBairro>IPE</xBairro><xMun>SAO JOSE DOS PINHAIS</xMun><CEP>83055320</CEP></enderEmit><IE>111111111111</IE><cRegTrib>3</cRegTrib><indRatISSQN>N</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\"1\"><prod><cProd>000001</cProd><xProd>Arruela Lisa 3/4</xProd><NCM>22011000</NCM><CFOP>5102</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><vProd>0.06</vProd><indRegra>A</indRegra><vDesc>0.00</vDesc><vOutro>0.00</vOutro><vItem>0.06</vItem></prod><imposto><vItem12741>0.42</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vICMS>0.00</vICMS><vProd>0.06</vProd><vDesc>0.00</vDesc><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vPISST>0.00</vPISST><vCOFINSST>0.00</vCOFINSST><vOutro>0.00</vOutro></ICMSTot><vCFe>0.06</vCFe><vCFeLei12741>0.00</vCFeLei12741></total><pgto><MP><cMP>01</cMP><vMP>1.00</vMP></MP><vTroco>0.94</vTroco></pgto><infAdic><infCpl>Obrigado, volte sempre</infCpl><obsFisco xCampo=\"xCampo1\"><xTexto>xTexto1</xTexto></obsFisco></infAdic></infCFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></CanonicalizationMethod><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"></SignatureMethod><Reference URI=\"#CFe35150982373077000171599000039370000225029039\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"></Transform><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></Transform></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"></DigestMethod><DigestValue>Nc4hNANxGX0qSSikDqT/YlpNOBbRYf2ofyBb8sqclz0=</DigestValue></Reference></SignedInfo><SignatureValue>Rxk0KyykR9XBPLxEE9cSO0nIHIO47yK2oOToKsnVqu6KYhkUv0QWk3FOW+9wHt8JfgXR4y+Rnyu8BMEzQKHNSBMUImjNQf9zZooD72d6P3La42QHiLrRymVplnAUaQWLRQQZgPV+A4TNY1UM7cC1pSKpBr5cVKKqcC2KHuoizhoQkgtgpq0QfI/HwDFkQZlch9YiZeSWtia8a48o8ka/6wdBhR71JqarTifIxYZ3Gk9DnmCVwyhv6ChqlpNirgnl4FBa7C61SLdZmskNS8wjdj3C+tPRiZFP58Bi1rxfZvSVwPB//O/L4Kn/WtDWkyS4r4VVR243O/H8BbfLFXUnwA==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></CFe>","nCFe":"000022"}
            //{"chave":"CFe35150982373077000171599000039370000235312876","codigoSefaz":"","dataProcessado":"2015-09-03T00:24:50.381-03:00","idPDV":"PDV001","idQrCode":"28nE+ZcMYZapG8uzBo8LP6j6tWovlf12/NYNn0+yOBfS+Bq72YNLbvzbXrvi+QEmDQAmvzB0AWQmK0W7r2B+2/DnebyVanOc8PqBj6Px26+sNsp22qTj5FSFkgVKb/I7f/iwSK2r2grb5cQ/wAQYMMyTvN8Hp3vztV08GwTv6wTstxfWk4LVIExkscAZVWOejLkOzG4b++jC9GYsWg9HBhl5mjPYxlGlzF0QO9cPhumo1yAKKgizPYwXVYU/rNljI26WSRVRXnY+MIakD2GFKMpDZGU59pYKY6mTL/FJ1wBNeGshhUhOxA9FTywfWvj8w2ebjsO68jKA3eyPDaH1Gw==","msgSefaz":"","nserieSAT":"900003937","sessao":"237987","tipoDocumento":"VENDA","uuid":"c5f82b29-b74a-400d-8d7a-ac2d850fc06d","xmlEnvio":"<CFe><infCFe versaoDadosEnt=\"00.06\"><ide><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><numeroCaixa>002</numeroCaixa></ide><emit><CNPJ>82373077000171</CNPJ><IE>111111111111</IE><indRatISSQN>N</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\"1\"><prod><cProd>000001</cProd><xProd>Arruela Lisa 3/4</xProd><NCM>22011000</NCM><CFOP>5102</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><indRegra>A</indRegra><vDesc>0.00</vDesc><vOutro>0.00</vOutro></prod><imposto><vItem12741>0.42</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><vCFeLei12741>0.00</vCFeLei12741></total><pgto><MP><cMP>01</cMP><vMP>1.00</vMP></MP></pgto><infAdic><infCpl>Obrigado, volte sempre</infCpl></infAdic></infCFe></CFe>","xmlProcessado":"<CFe><infCFe Id=\"CFe35150982373077000171599000039370000235312876\" versao=\"0.06\" versaoDadosEnt=\"00.06\" versaoSB=\"010000\"><ide><cUF>35</cUF><cNF>531287</cNF><mod>59</mod><nserieSAT>900003937</nserieSAT><nCFe>000023</nCFe><dEmi>20150903</dEmi><hEmi>002629</hEmi><cDV>6</cDV><tpAmb>2</tpAmb><CNPJ>16716114000172</CNPJ><signAC>SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT</signAC><assinaturaQRCODE>28nE+ZcMYZapG8uzBo8LP6j6tWovlf12/NYNn0+yOBfS+Bq72YNLbvzbXrvi+QEmDQAmvzB0AWQmK0W7r2B+2/DnebyVanOc8PqBj6Px26+sNsp22qTj5FSFkgVKb/I7f/iwSK2r2grb5cQ/wAQYMMyTvN8Hp3vztV08GwTv6wTstxfWk4LVIExkscAZVWOejLkOzG4b++jC9GYsWg9HBhl5mjPYxlGlzF0QO9cPhumo1yAKKgizPYwXVYU/rNljI26WSRVRXnY+MIakD2GFKMpDZGU59pYKY6mTL/FJ1wBNeGshhUhOxA9FTywfWvj8w2ebjsO68jKA3eyPDaH1Gw==</assinaturaQRCODE><numeroCaixa>002</numeroCaixa></ide><emit><CNPJ>82373077000171</CNPJ><xNome>BEMATECH S.A</xNome><enderEmit><xLgr>RUI BARBOSA</xLgr><nro>2529</nro><xCpl>: MODULOS 06 07 E 08;</xCpl><xBairro>IPE</xBairro><xMun>SAO JOSE DOS PINHAIS</xMun><CEP>83055320</CEP></enderEmit><IE>111111111111</IE><cRegTrib>3</cRegTrib><indRatISSQN>N</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\"1\"><prod><cProd>000001</cProd><xProd>Arruela Lisa 3/4</xProd><NCM>22011000</NCM><CFOP>5102</CFOP><uCom>UN</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><vProd>0.06</vProd><indRegra>A</indRegra><vDesc>0.00</vDesc><vOutro>0.00</vOutro><vItem>0.06</vItem></prod><imposto><vItem12741>0.42</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vICMS>0.00</vICMS><vProd>0.06</vProd><vDesc>0.00</vDesc><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vPISST>0.00</vPISST><vCOFINSST>0.00</vCOFINSST><vOutro>0.00</vOutro></ICMSTot><vCFe>0.06</vCFe><vCFeLei12741>0.00</vCFeLei12741></total><pgto><MP><cMP>01</cMP><vMP>1.00</vMP></MP><vTroco>0.94</vTroco></pgto><infAdic><infCpl>Obrigado, volte sempre</infCpl><obsFisco xCampo=\"xCampo1\"><xTexto>xTexto1</xTexto></obsFisco></infAdic></infCFe><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></CanonicalizationMethod><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"></SignatureMethod><Reference URI=\"#CFe35150982373077000171599000039370000235312876\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"></Transform><Transform Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"></Transform></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"></DigestMethod><DigestValue>lkXNQHJyj6bEyfpdkztTHAIZgrbTP9uqd/qEAUSeK0o=</DigestValue></Reference></SignedInfo><SignatureValue>ZDUpZ8Tp7kEu6FucU2he0BNY6DfZJrFpUqz2zwrdNg35BMwvQ07YqODGgjNCxp2DIFipuZz7XtiVK20SJlyvB88XXq3hvGLBYxbb2tlxFVOutS+WseRa4d8jwAyvbozCDl8Y4YfWkqfVWRNVCG/S4FhKo9Kx1Ie3Akmhk7bZGsaqf12/RRcEoOYl/evqq9nnLYy3vMnYTDRMEfzAz2h/94isX5jxo7NGNldgNkW4HrXZVNu3eH0YOWgR8sxNWjsjI9Dnww/kEcxs0ntF2xRWSl4nDGMUDo3yqacvCKHf8Wg5v4r7wRHbppB7VWBB39Jq3/Di5eHtKoplkByAi8wSgw==</SignatureValue><KeyInfo><X509Data><X509Certificate>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</X509Certificate></X509Data></KeyInfo></Signature></CFe>","nCFe":"000023"}


        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CFeSATEmissaoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CFeSATEmissaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
