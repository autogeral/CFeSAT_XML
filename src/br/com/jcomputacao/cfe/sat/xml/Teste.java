/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cfe.sat.xml;

import br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFe;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

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
            context.createMarshaller().marshal(cfe, baos);
            String xml = baos.toString();
            System.out.println(xml);
        } catch (JAXBException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
