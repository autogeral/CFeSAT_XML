/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cfe.sat.xml;

import br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFe;
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

            EnvCFe envCfe = new EnvCFe();
            envCfe.setCUF("SP");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            JAXBContext context = JAXBContext.newInstance(br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFe.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(cfe, baos);
            String xml = baos.toString();
            System.out.println(xml);
            
            baos = new ByteArrayOutputStream();
            marshaller.setProperty("eclipselink.media-type", "application/json");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(cfe, baos);
            String json = baos.toString();
            System.out.println(json);

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
