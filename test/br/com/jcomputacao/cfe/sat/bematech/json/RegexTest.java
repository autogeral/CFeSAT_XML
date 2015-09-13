package br.com.jcomputacao.cfe.sat.bematech.json;

/**
 * 13/09/2015 12:09:03
 *
 * @author murilo
 */
public class RegexTest {

    public static void main(String args[]) {
        String json = "{\"ide\":{\"cnpj\":16716114000172,\"signAC\":\"SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT\",\"numeroCaixa\":\"PDV001\"},\"emit\":{\"cnpj\":\"05437537000137\",\"xNome\":\"AUTO GERAL AUTOPECAS LTDA\",\"xFant\":\"AUTO GERAL\",\"ie\":387034155115,\"im\":12677,\"indRatISSQN\":\"S\"},\"dest\":{\"cpf\":27933992803},\"det\":[{\"prod\":{\"cProd\":\"000001\",\"cean\":\"\",\"xProd\":\"ARRUELA LISA\",\"ncm\":73181500,\"cfop\":5102,\"uCom\":\"PC\",\"qCom\":\"1.00\",\"vUnCom\":0.06,\"vProd\":0.06,\"indRegra\":\"A\",\"vOutro\":\"0.00\",\"vItem\":0.06},\"imposto\":{\"vItem12741\":0.02,\"icms\":{\"icms00\":{\"orig\":0,\"cst\":\"00\",\"picms\":\"18.00\",\"vicms\":0.01}},\"pis\":{\"pisnt\":{\"cst\":\"00\"}},\"cofins\":{\"cofinsnt\":{\"cst\":\"00\"}}},\"nItem\":1}],\"total\":{\"icmsTot\":{\"vicms\":0.01,\"vProd\":0.06,\"vDesc\":\"0.00\",\"vpis\":\"0.00\",\"vcofins\":\"0.00\",\"vOutro\":\"0.00\"},\"vcFe\":0.06,\"vcFeLei12741\":0.02},\"pgto\":{\"mp\":[{\"cmp\":1,\"vmp\":0.06}]},\"infAdic\":{\"infCpl\":\"VLR APRX. R$ 0,01 FEDERAL E R$ 0,01 ESTADUAL\\nFONTE IBPT 5OI7EW\\n CAIXA NAO ABERTO VENDEDOR GERALDO\"}}";
        String regex = "([:]\\d+[\\,|}])";
        
        String tjson = json.replaceAll(regex, "<TO_QUOTE>$1<TO_QUOTE>");;
        regex = "([:]\\d+[.]\\d+[\\,|}])";
        tjson = tjson.replaceAll(regex, "<TO_QUOTE>$1<TO_QUOTE>");
        System.out.println(json);
        tjson = tjson.replaceAll(",<TO_QUOTE>", "\",");
        tjson = tjson.replaceAll("<TO_QUOTE>:", ":\"");
        tjson = tjson.replaceAll("}<TO_QUOTE>", "\"}");
        
        System.out.println(tjson);
    }

}
