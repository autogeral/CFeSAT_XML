/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.cfe.sat.xml.recepcao.EnvCFeValidacao;

/**
 * 13/09/2015 23:33:36
 * @author murilo
 */
public class EnvCFeTest {
    
    public static void main(String args[]) {
        //String xml = "<CFe><infCFe versaoDadosEnt=\\\"00.06\\\"><ide><CNPJ>09346052000199</CNPJ><signAC>HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B/8BhmaBy55owBWkKXk6w8/nurdyFrJyfzz/xDghI91d/Tni95xljZwvL85VhsrUkAQF18u/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==</signAC><numeroCaixa>001</numeroCaixa></ide><emit><CNPJ>05437537000137</CNPJ><IE>387034155115</IE><IM>12677</IM><indRatISSQN>S</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\\\"1\\\"><prod><cProd>000001</cProd><xProd>ARRUELA LISA</xProd><CFOP>5102</CFOP><uCom>PC</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><vProd>0.06</vProd><indRegra>A</indRegra><vOutro>0.00</vOutro><vItem>0.06</vItem></prod><imposto><vItem12741>0.02</vItem12741><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>18.00</pICMS><vICMS>0.01</vICMS></ICMS00></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vICMS>0.01</vICMS><vProd>0.06</vProd><vDesc>0.00</vDesc><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro></ICMSTot></total><pgto><MP><cMP>01</cMP><vMP>0.06</vMP></MP></pgto><infAdic><infCpl>VLR APRX. R$ 0,01 FEDERAL E R$ 0,01 ESTADUAL, FONTE IBPT 5OI7EW, CAIXA NAO ABERTO VENDEDOR GERALDO</infCpl></infAdic></infCFe></CFe>";
        
        String xml = "<CFe><infCFe versaoDadosEnt=\"00.06\"><ide><CNPJ>09346052000199</CNPJ><signAC>HF18DLyfUnMqMb06KbaE58GdNUdRIE4FS0+nd5bzNlWAv4Xo2Te+QpFGNyR00oV3u+1Kj7Zr8jf0B/8BhmaBy55owBWkKXk6w8/nurdyFrJyfzz/xDghI91d/Tni95xljZwvL85VhsrUkAQF18u/Pu0SPHdaOf3Qvib7ragLEyfxnwtmUohfwZerylvioHjeUR1iytFWuxt86+2HuYq2j+SltGoXQyWB5LZRB12ncBbycpJ0WvtPSkH2IGA0iV5I+oEIpFAhBtl4D8UezCYKcCsyT9LihCVeFrkhB+nXjq90IEY5gQgBbm+ekc5DVRtzf4Va7LAKBOoqPbZgTcpPLw==</signAC><numeroCaixa>001</numeroCaixa></ide><emit><CNPJ>05437537000137</CNPJ><IE>387034155115</IE><IM>12677</IM><indRatISSQN>S</indRatISSQN></emit><dest><CPF>27933992803</CPF></dest><det nItem=\"1\"><prod><cProd>000001</cProd><xProd>ARRUELA LISA</xProd><CFOP>5102</CFOP><uCom>PC</uCom><qCom>1.0000</qCom><vUnCom>0.06</vUnCom><vProd>0.06</vProd><indRegra>A</indRegra><vOutro>0.00</vOutro><vItem>0.06</vItem></prod><imposto><vItem12741>0.02</vItem12741><ICMS><ICMS00><Orig>0</Orig><CST>00</CST><pICMS>18.00</pICMS><vICMS>0.01</vICMS></ICMS00></ICMS><PIS><PISNT><CST>04</CST></PISNT></PIS><COFINS><COFINSNT><CST>04</CST></COFINSNT></COFINS></imposto></det><total><ICMSTot><vICMS>0.01</vICMS><vProd>0.06</vProd><vDesc>0.00</vDesc><vPIS>0.00</vPIS><vCOFINS>0.00</vCOFINS><vOutro>0.00</vOutro></ICMSTot></total><pgto><MP><cMP>01</cMP><vMP>0.06</vMP></MP></pgto><infAdic><infCpl>VLR APRX. R$ 0,01 FEDERAL E R$ 0,01 ESTADUAL, FONTE IBPT 5OI7EW, CAIXA NAO ABERTO VENDEDOR GERALDO</infCpl></infAdic></infCFe></CFe>";
        System.out.println(xml);
    }

}
