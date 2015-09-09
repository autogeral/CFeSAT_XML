/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cfe.sat.bematech.json;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import org.junit.Test;

/**
 *
 * @author murilo
 */
public class ConfiguracaoVOTest {
    
    public ConfiguracaoVOTest() {
    }

    @Test
    public void testSomeMethod() {
        String json = "{\"ConfiguracaoVO\":{\"licenciado\":\"true\",\"modulo\":\"CONCENTRADOR\",\"nome\":\"ConcentradorAD01\",\"serial\":\"SAT47411578042574862\",\"validadeLicenca\":\"30/10/2015 23:59:59\",\"versao\":\"1.0.4\"}}";
        XStream xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.alias("ConfiguracaoVO", ConfiguracaoVO.class);
        Object a = xstream.fromXML(json);
        System.out.println(a);
    }
    
}
