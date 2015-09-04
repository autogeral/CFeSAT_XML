package br.com.jcomputacao.cfe.sat.xml;

import br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFe;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import java.io.ByteArrayOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * 16/08/2015 16:33:54
 *
 * @author murilo
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            br.com.jcomputacao.cfe.sat.xml.recepcao.ObjectFactory of = new br.com.jcomputacao.cfe.sat.xml.recepcao.ObjectFactory();
            EnvCFe.LoteCFe.CFe cfe = of.createEnvCFeLoteCFeCFe();
            EnvCFe.LoteCFe.CFe.InfCFe infCfe = of.createEnvCFeLoteCFeCFeInfCFe();
            if (cfe.getInfCFe() == null) {
                cfe.setInfCFe(infCfe);
                infCfe.setVersao("006");
            }
            EnvCFe.LoteCFe.CFe.InfCFe.Dest dest = of.createEnvCFeLoteCFeCFeInfCFeDest();
            dest.setXNome("Nome exemplo");
            dest.setCNPJ("0000000000000");
            dest.setCPF("00000000000");
            infCfe.setDest(dest);
            
            
            EnvCFe.LoteCFe.CFe.InfCFe.Entrega entrega = of.createEnvCFeLoteCFeCFeInfCFeEntrega();
            entrega.setXLgr("Rua Marechal Deodoro");
            entrega.setNro("505");
            entrega.setXCpl("Apto 132");
            entrega.setXBairro("Chafariz");
            entrega.setXMun("Itu");
            entrega.setUF("SP");
            infCfe.setEntrega(entrega);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Det det = of.createEnvCFeLoteCFeCFeInfCFeDet();
            det.setNItem("1");
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Prod prod = of.createEnvCFeLoteCFeCFeInfCFeDetProd();
            prod.setCProd("00001");
            prod.setXProd("Arruela Lisa");
            prod.setVItem("0.06");
            prod.setUCom("PC");
            prod.setQCom("1.00");
            prod.setCEAN("");
            prod.setCFOP("5102");
            prod.setNCM("00000000");
            prod.setCEAN("7890000000000");
            det.setProd(prod);
            
            det.setInfAdProd("Exemplo de mensagem informativa.");
            
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto imposto = of.createEnvCFeLoteCFeCFeInfCFeDetImposto();
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS icms = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoICMS();
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.ICMS.ICMS00 icms00 = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoICMSICMS00();
            icms00.setCST("00");
            icms00.setOrig("0");
            icms00.setPICMS("18.0000");
            icms00.setVICMS("0.0108");
            icms.setICMS00(icms00);
            imposto.setICMS(icms);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS cofins = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoCOFINS();
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.COFINS.COFINSNT cofinsNT = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoCOFINSCOFINSNT();
            cofinsNT.setCST("04");
            cofins.setCOFINSNT(cofinsNT);
            imposto.setCOFINS(cofins);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS pis = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoPIS();
            EnvCFe.LoteCFe.CFe.InfCFe.Det.Imposto.PIS.PISNT pisNT = of.createEnvCFeLoteCFeCFeInfCFeDetImpostoPISPISNT();
            pisNT.setCST("04");
            pis.setPISNT(pisNT);
            imposto.setPIS(pis);
            
            imposto.setVItem12741("0.02");
            
            det.setImposto(imposto);
            
            infCfe.getDet().add(det);
            
            
            EnvCFe.LoteCFe.CFe.InfCFe.Emit emit = of.createEnvCFeLoteCFeCFeInfCFeEmit();
            emit.setCNPJ("05437537000137");
            emit.setIE("387034155115");
            emit.setIM("12677");
            emit.setXFant("Auto Geral");
            emit.setXNome("Auto Geral Autopeças LTDA");
            
            EnvCFe.LoteCFe.CFe.InfCFe.Emit.EnderEmit enderecoEmitente = of.createEnvCFeLoteCFeCFeInfCFeEmitEnderEmit();
            enderecoEmitente.setXLgr("Av. Dr. Octaviano Pereira Mendes");
            enderecoEmitente.setNro("1333");
            enderecoEmitente.setXBairro("Liberdade");
            enderecoEmitente.setXMun("Itu");
            enderecoEmitente.setCEP("13300-110");
            
            emit.setEnderEmit(enderecoEmitente);
            infCfe.setEmit(emit);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Pgto pgto = of.createEnvCFeLoteCFeCFeInfCFePgto();
            EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP mp = of.createEnvCFeLoteCFeCFeInfCFePgtoMP();
            mp.setCMP("1");
            mp.setCAdmC("A VISTA");
            mp.setVMP("0.10");
            pgto.getMP().add(mp);
            pgto.setVTroco("0.04");
            infCfe.setPgto(pgto);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Total total = of.createEnvCFeLoteCFeCFeInfCFeTotal();
            total.setVCFe("0.06");
            total.setVCFeLei12741("0.02");

            infCfe.setTotal(total);
            
            EnvCFe.LoteCFe.CFe.InfCFe.Ide ide = of.createEnvCFeLoteCFeCFeInfCFeIde();
            ide.setNumeroCaixa("PDV001");
            ide.setSignAC("SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT");
            ide.setCNPJ("16716114000172");
            infCfe.setIde(ide);

            EnvCFe envCfe = new EnvCFe();
            envCfe.setCUF("SP");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JAXBContext context = JAXBContext.newInstance(br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFe.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(cfe, baos);
            String xml = baos.toString();
            System.out.println(xml);
            
            baos = new ByteArrayOutputStream();
//            marshaller.setProperty("eclipselink.media-type", "application/json");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(cfe, baos);
            String json = baos.toString();
            System.out.println(json);
            
            XStream xstream = new XStream(new JettisonMappedXmlDriver());
            //xstream.processAnnotations(SatVendaVO.class);
            xstream.alias("venda", EnvCFe.LoteCFe.CFe.class);
            xstream.alias("infCfe", EnvCFe.LoteCFe.CFe.InfCFe.class);
            xstream.alias("det", EnvCFe.LoteCFe.CFe.InfCFe.Det.class);
            xstream.alias("entrega", EnvCFe.LoteCFe.CFe.InfCFe.Entrega.class);
            xstream.alias("pgto", EnvCFe.LoteCFe.CFe.InfCFe.Pgto.class);
            xstream.alias("mp", EnvCFe.LoteCFe.CFe.InfCFe.Pgto.MP.class);
            
            xstream.setMode(XStream.NO_REFERENCES);
            String resultado = xstream.toXML(cfe);
            System.out.println(resultado);

//            //http://examples.javacodegeeks.com/core-java/xml/bind/jaxb-json-example/
              //To use MOXy as your JAXB provider you need to include a file called jaxb.properties with the following entry in the same package as your domain model:
//            // Set the Marshaller media type to JSON or XML
//            marshaller.setProperty(MarshallerProperties.MEDIA_TYPE,
//                    "application/json");
//
//            // Set it to true if you need to include the JSON root element in the JSON output
//            marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
//
//            // Set it to true if you need the JSON output to formatted
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            // Marshal the employee object to JSON and print the output to console
//            marshaller.marshal(employee, System.out);
        } catch (JAXBException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
