package br.com.jcomputacao.cfe.sat.bematech;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author murilo
 */
public class BematechFiscalJSonClientTest {

    private String serverHost;
    private int serverPort;

    public BematechFiscalJSonClientTest() {
    }

    @Before
    public void setUp() {
        System.setProperty("sat.server.host", "AD01");
        System.setProperty("sat.server.port", "8888");

        this.serverHost = "AD01";
        this.serverPort = 8888;
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validar method, of class BematechFiscalJSonClient.
     */
    @Test
    public void testValidar() throws Exception {
        System.out.println("validar");
        String json = "{\"ide\":{\"cnpj\":\"09346052000199\",\"signAC\":\"HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B\\/8BhmaBy55owBWkKXk6w8\\/nurdyFrJyfzz\\/xDghI91d\\/Tni95xljZwvL85VhsrUkAQF18u\\/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==\",\"numeroCaixa\":1},\"emit\":{\"cnpj\":\"05437537000137\",\"xNome\":\"AUTO GERAL AUTOPECAS LTDA\",\"xFant\":\"AUTO GERAL\",\"ie\":387034155115,\"im\":12677,\"indRatISSQN\":\"S\"},\"dest\":{\"cpf\":27933992803},\"det\":[{\"prod\":{\"cProd\":\"000001\",\"cean\":\"\",\"xProd\":\"ARRUELA LISA\",\"ncm\":73181500,\"cfop\":5102,\"uCom\":\"PC\",\"qCom\":\"1,00\",\"vUnCom\":0.06,\"vProd\":0.06,\"indRegra\":\"A\",\"vOutro\":\"0.00\",\"vItem\":0.06},\"imposto\":{\"vItem12741\":0.02,\"icms\":{\"icms00\":{\"orig\":0,\"cst\":\"00\",\"picms\":\"18.00\",\"vicms\":0.01}},\"pis\":{\"pisnt\":{\"cst\":\"00\"}},\"cofins\":{\"cofinsnt\":{\"cst\":\"00\"}}},\"nItem\":1}]},\"total\":{\"icmsTot\":{\"vicms\":0.01,\"vProd\":0.06,\"vDesc\":\"0.00\",\"vpis\":\"0.00\",\"vcofins\":\"0.00\",\"vOutro\":\"0.00\"},\"vcFe\":\"0,06\",\"vcFeLei12741\":0.02},\"pgto\":{\"mp\":[{\"cmp\":1,\"vmp\":0.06}]},\"infAdic\":{\"infCpl\":\"VLR APRX. R$ 0,01 FEDERAL E R$ 0,01 ESTADUAL\\nFONTE IBPT 5OI7EW\\n CAIXA NAO ABERTO VENDEDOR GERALDO\"}}";
        json = "{\"idPDV\":\"PDV001\",\"dest\":{\"CPF\":\"27933992803\"},\"det\":[{\"nItem\":\"1\",\"imposto\":{\"COFINS\":{\"COFINSNT\":{\"CST\":\"04\"}},\"ICMS\":{\"ICMS40\":{\"Orig\":\"0\",\"CST\":\"60\"}},\"PIS\":{\"PISNT\":{\"CST\":\"04\"}},\"vItem12741\":\"0.01\"},\"prod\":{\"CFOP\":\"5405\",\"NCM\":\"73181500\",\"cProd\":\"00001\",\"indRegra\":\"A\",\"qCom\":\"1.0000\",\"uCom\":\"UN\",\"vDesc\":\"0.00\",\"vUnCom\":\"0.06\",\"xProd\":\"ARRUELA LISA\",\"vOutro\":\"0.00\"}}],\"emit\":{\"CNPJ\":\"05437537000137\",\"IE\":\"387034155115\",\"indRatISSQN\":\"S\"},\"entrega\":null,\"ide\":{\"CNPJ\":\"09346052000199\",\"numeroCaixa\":\"001\",\"signAC\":\"HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B/8BhmaBy55owBWkKXk6w8/nurdyFrJyfzz/xDghI91d/Tni95xljZwvL85VhsrUkAQF18u/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==\"},\"total\":{\"vCFeLei12741\":\"0.01\"},\"pgto\":{\"MP\":[{\"cMP\":\"01\",\"vMP\":\"0.06\"}]},\"dataInserido\":\"17/09/2015 18:00:18\",\"infAdic\":{\"infCpl\":\"Obrigado, volte sempre\"},\"extratoResumido\":false}";
        BematechFiscalJSonClient instance = new BematechFiscalJSonClient(serverHost, serverPort);
        int expResult = 200;
        int result = instance.validar(json);
        assertEquals(expResult, result);
        if (result == expResult) {
            System.out.println(instance.getResponse());
        }
    }
//
//    /**
//     * Test of transmitir method, of class BematechFiscalJSonClient.
//     */
//    @Test
//    public void testTransmitir() throws Exception {
//        System.out.println("transmitir");
//        String json = "";
//        BematechFiscalJSonClient instance = null;
//        int expResult = 0;
//        int result = instance.transmitir(json);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cancelar method, of class BematechFiscalJSonClient.
//     */
//    @Test
//    public void testCancelar() throws Exception {
//        System.out.println("cancelar");
//        String json = "";
//        BematechFiscalJSonClient instance = null;
//        int expResult = 0;
//        int result = instance.cancelar(json);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of impressaoPdf method, of class BematechFiscalJSonClient.
//     */
//    @Test
//    public void testImpressao() throws Exception {
//        System.out.println("impressaoPdf");
//        String chave = "";
//        BematechFiscalJSonClient instance = null;
//        int expResult = 0;
//        int result = instance.impressaoPdf(chave);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of statusImpressora method, of class BematechFiscalJSonClient.
//     */

    @Test
    public void testStatusImpressora() throws Exception {
        System.out.println("statusImpressora");
        BematechFiscalJSonClient instance = new BematechFiscalJSonClient(serverHost, serverPort);
        int expResult = 200;
        int result = instance.statusImpressora();
        System.out.println("statusImpressora response : " + instance.getResponse());
        assertEquals(expResult, result);
    }

}
