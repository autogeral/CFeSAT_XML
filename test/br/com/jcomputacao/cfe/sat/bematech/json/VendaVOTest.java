package br.com.jcomputacao.cfe.sat.bematech.json;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

/**
 * 09/09/2015 00:53:02
 * @author murilo
 */
public class VendaVOTest {

    public static void main(String a[]) {
        String json = "{\"VendaVO\":{\"msgErro\":\"Erros de validacao encontrado nos dados informados\",\"problemas\":[\"[pgto.MP] - Deve ser informado de 1 a 10 meios de pagamento\",\"[det.imposto] - Informe ISSQN ou ICMS\",\"[det.imposto.PIS] - Imposto PIS é obrigatÃ³rio ser informado\",\"[det.imposto.COFINS] - Imposto COFINS é obrigatÃ³rio ser informado\",\"[dest] - Informações do destinatário nÃ£o fornecido\",\"[infAdic.infCpl] - Informações complementares de interesse do Contribuinte, informe até 5000 caracteres\",\"[emit.CNPJ] - CNPJ Emissor nÃ£o fornecido\",\"[emit.CNPJ] - CNPJ Emissor deve ter 14 caracteres numéricos\",\"[emit.IE] - IE deve ser fornecido\",\"[det.prod.xProd] - Descrição do produto ou serviço deve ser fornecido de 1 a 120 caracteres alfa-numéricos.\",\"[det.prod.CFOP] - CFOP deve ser fornecido com 4 caracteres numéricos.\",\"[det.prod.qCom] - Quantidade comercial deve ser fornecido. Ex.: 1.0000 ou 200.0000\",\"[ide.cnpj] - CNPJ Software Emissor não fornecido\",\"[ide.numeroCaixa] - Número do caixa deve ser de 000 a 999 com 3 posições\"]}}";
        XStream xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.alias("VendaVO", VendaVO.class);
        xstream.addImplicitCollection(VendaVO.class, "problemas");
        Object obj = xstream.fromXML(json);
        System.out.println(obj);

        json = "{\"VendaVO\":{\"msg\": \"Nenhum problema encontrado\"}}";
        obj = xstream.fromXML(json);
        if (obj instanceof VendaVO) {
            VendaVO vvo = (VendaVO) obj;
            if ("Nenhum problema encontrado".equalsIgnoreCase(vvo.getMsg())) {
                System.out.println("Venda validada");
            }
        }
        System.out.println(obj);

        json = "{\"VendaVO\":{\n"
                + "  \"msgErro\": \"Erros de validação encontrado nos dados informados\",\n"
                + "  \"problemas\": [\n"
                + "    \"[pgto.MP.cMP] - Código do meio de pagamento cMP está inválido. Possíveis valores são 01, 02, 03, 04, 05, 10 , 11, 12, 13 e 99\",\n"
                + "    \"[det.imposto] - Informe ISSQN ou ICMS\"\n"
                + "  ]\n"
                + "}}";
        obj = xstream.fromXML(json);
        System.out.println(obj);
        if (obj instanceof VendaVO) {
            VendaVO vvo = (VendaVO) obj;

            if ("Nenhum problema encontrado".equalsIgnoreCase(vvo.getMsg())) {
                System.out.println("Venda validada");
            }

            for (Object oobj : vvo.getProblemas()) {
                System.out.println(oobj.getClass().getName() + " " + oobj);
            }
        }
        System.out.flush();

    }

}
