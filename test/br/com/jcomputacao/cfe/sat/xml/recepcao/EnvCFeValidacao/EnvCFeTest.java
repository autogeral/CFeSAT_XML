/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFeValidacao;

import br.com.jcomputacao.cfe.sat.bematech.BematechFiscalXmlClient;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 13/09/2015 23:33:36
 * @author murilo
 */
public class EnvCFeTest {

    public static void main(String args[]) {
        //String xml = "<CFe><infCFe versaoDadosEnt=\\\"00.06\\\"><ide><CNPJ>09346052000199</CNPJ><signAC>HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B/8BhmaBy55owBWkKXk6w8/nurdyFrJyfzz/xDghI91d/Tni95xljZwvL85VhsrUkAQF18u/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==</signAC><numeroCaixa>001</numeroCaixa></ide><emit><CNPJ>05437537000137</CNPJ><IE>387034155115</IE><IM>12677</IM><indRatISSQN>S</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\\\"1\\\"><prod><cProd>000001</cProd><xProd>ARRUELA LISA</xProd><CFOP>5102</CFOP><uCom>PC</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><vProd>0.06</vProd><indRegra>A</indRegra><vOutro>0.00</vOutro><vItem>0.06</vItem></prod><imposto><vItem12741>0.02</vItem12741><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>18.00</pICMS><vICMS>0.01</vICMS></ICMS00></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vICMS>0.01</vICMS><vProd>0.06</vProd><vDesc>0.00</vDesc><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro></ICMSTot></total><pgto><MP><cMP>01</cMP><vMP>0.06</vMP></MP></pgto><infAdic><infCpl>VLR APRX. R$ 0,01 FEDERAL E R$ 0,01 ESTADUAL, FONTE IBPT 5OI7EW, CAIXA NAO ABERTO VENDEDOR GERALDO</infCpl></infAdic></infCFe></CFe>";

        String xml = "<CFe><infCFe versaoDadosEnt=\"00.06\">\n"
                + "<ide><CNPJ>09346052000199</CNPJ><signAC>IRnlFHk/080OxCUZRJPs/aE/c+yNNeyLUz+Ygq/qBx+HxY5UETY/elK6me7XleqP1NifNpkBiKxRUN7nW4X2GxgTVJ8JN0Asuzw08WtSfwAQGQN2FzbLpABjso4fPzUByxZBuorIKi7wNJCKyAzRxXmHlb08bANod8R4kVU3Q87A4nAdPujRbYvyKlnOFxdXd29hsGef72KzdqQQN/U+rcv8zdlg9Q/o9mAU4Mq7ERzzqxZGP/keD4fjvYG30NhFtNI8gp2yC9ZQa3E40Cs7WyuaZYVsvUXKXuPHeNqruxwRDYu1fsLHIP/CDBdffUw8PPVsUdDRcwgZHBU0W0uRpw==</signAC><numeroCaixa>001</numeroCaixa></ide><emit><CNPJ>05437537000641</CNPJ><IE>554000981113</IE><indRatISSQN>S</indRatISSQN></emit><dest><CNPJ>12265241000141</CNPJ><xNome>MANTEZE MOVEIS PLANEJADOS E ESQUADRIAS EM ALUMINIO EIRELI EPP</xNome></dest>\n"
                + "<det nItem=\"1\"><prod><cProd>008033D</cProd><xProd>PIVO BESTA</xProd><NCM>87089990</NCM><CFOP>5405</CFOP><uCom>PC</uCom><qCom>2.0000</qCom><vUnCom>103.47</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>55.87</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>206.94</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>206.94</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"2\"><prod><cProd>018679</cProd><xProd>PASTILHA FREIO</xProd><NCM>87083019</NCM><CFOP>5405</CFOP><uCom>JG</uCom><qCom>1.0000</qCom><vUnCom>51.58</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>13.93</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>51.58</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>51.58</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"3\"><prod><cProd>025445</cProd><xProd>REPARO PINCA</xProd><NCM>87083090</NCM><CFOP>5405</CFOP><uCom>JG</uCom><qCom>1.0000</qCom><vUnCom>48.44</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>13.08</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>48.44</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>48.44</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"4\"><prod><cProd>024892A</cProd><xProd>REPARO FREIO</xProd><NCM>85122011</NCM><CFOP>5405</CFOP><uCom>JG</uCom><qCom>2.0000</qCom><vUnCom>37.14</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>31.94</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>74.28</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>74.28</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"5\"><prod><cProd>008073F</cProd><xProd>PIVO BESTA</xProd><NCM>87089990</NCM><CFOP>5405</CFOP><uCom>PC</uCom><qCom>1.0000</qCom><vUnCom>63.26</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>17.08</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>63.26</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>63.26</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"6\"><prod><cProd>008073D</cProd><xProd>PIVO BESTA</xProd><NCM>87088000</NCM><CFOP>5405</CFOP><uCom>PC</uCom><qCom>1.0000</qCom><vUnCom>85.37</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>23.05</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>85.37</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>85.37</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"7\"><prod><cProd>015652D</cProd><xProd>GRAXA 1KG</xProd><NCM>27101932</NCM><CFOP>5656</CFOP><uCom>KG</uCom><qCom>1.0000</qCom><vUnCom>22.09</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>7.73</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>22.09</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>22.09</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"8\"><prod><cProd>004969</cProd><xProd>FLUIDO FREIO</xProd><NCM>38190000</NCM><CFOP>5102</CFOP><uCom>FR</uCom><qCom>1.0000</qCom><vUnCom>21.46</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>6.01</vItem12741><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>18.00</pICMS></ICMS00></ICMS><PIS><PISAliq><CST>01</CST><vBC>21.46</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>21.46</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"9\"><prod><cProd>031976</cProd><xProd>DISCO FREIO</xProd><NCM>87083090</NCM><CFOP>5405</CFOP><uCom>PC</uCom><qCom>2.0000</qCom><vUnCom>101.90</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>55.03</vItem12741><ICMS><ICMS40><Orig>0</Orig><CST>60</CST></ICMS40></ICMS><PIS><PISAliq><CST>01</CST><vBC>203.80</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>203.80</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<det nItem=\"10\"><prod><cProd>000362A</cProd><xProd>CUPILHA RODA</xProd><NCM>73182400</NCM><CFOP>5102</CFOP><uCom>PC</uCom><qCom>2.0000</qCom><vUnCom>0.42</vUnCom><indRegra>A</indRegra><vOutro>0.00</vOutro></prod><imposto><vItem12741>0.30</vItem12741><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>18.00</pICMS></ICMS00></ICMS><PIS><PISAliq><CST>01</CST><vBC>0.84</vBC><pPIS>0.0065</pPIS></PISAliq></PIS><COFINS><COFINSAliq><CST>01</CST><vBC>0.84</vBC><pCOFINS>0.0300</pCOFINS></COFINSAliq></COFINS></imposto></det>\n"
                + "<total><vCFeLei12741>224.02</vCFeLei12741></total>\n"
                + "<pgto><MP><cMP>02</cMP><vMP>778.06</vMP></MP></pgto><infAdic><infCpl>COD 5206 VLR APRX. R$ 170,31 FEDERAL E R$ 105,95 ESTADUAL, FONTE IBPT 5OI7EW, CAIXA 905.6 VENDEDOR MARIO COMPRADOR CIPO</infCpl></infAdic></infCFe></CFe>";
        System.out.println(xml);
        BematechFiscalXmlClient bfxc = new BematechFiscalXmlClient("BD06", 8888);
        try {
            int validado = bfxc.validar(xml);
            System.out.println("Validado : " + validado);
            System.out.println("Response : " +bfxc.getResponse());
        } catch (IOException ex) {
            Logger.getLogger(EnvCFeTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
