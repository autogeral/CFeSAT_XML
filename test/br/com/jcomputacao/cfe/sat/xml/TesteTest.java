/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cfe.sat.xml;

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
public class TesteTest {

    public TesteTest() {
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

    /**
     * Test of main method, of class Teste.
     */
    @Test
    public void testMain() {
        String expected = "{\n"
                + "  \"dest\": {\n"
                + "    \"xNome\": \"Nome exemplo\",\n"
                + "    \"CNPJ\": \"0000000000000\",\n"
                + "    \"CPF\": \"00000000000\"\n"
                + "  },\n"
                + "  \"det\": [\n"
                + "    {\n"
                + "      \"imposto\": {\n"
                + "        \"COFINS\": {\n"
                + "          \"COFINSAliq\": {\n"
                + "            \"vBC\": \"10.00\",\n"
                + "            \"pCOFINS\": \"0.0065\",\n"
                + "            \"CST\": \"01\"\n"
                + "          },\n"
                + "          \"COFINSNT\": {\n"
                + "            \"CST\": \"04\"\n"
                + "          },\n"
                + "          \"COFINSOutr\": {\n"
                + "            \"vBC\": \"10.00\",\n"
                + "            \"pCOFINS\": \"0.0065\",\n"
                + "            \"qBCProd\": \"1.0000\",\n"
                + "            \"vAliqProd\": \"1.0000\",\n"
                + "            \"CST\": \"99\"\n"
                + "          },\n"
                + "          \"COFINSQtde\": {\n"
                + "            \"qBCProd\": \"1.0000\",\n"
                + "            \"vAliqProd\": \"1.0000\",\n"
                + "            \"CST\": \"03\"\n"
                + "          },\n"
                + "          \"COFINSSN\": {\n"
                + "            \"CST\": \"49\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"COFINSST\": {\n"
                + "          \"vBC\": \"100.00\",\n"
                + "          \"pCOFINS\": \"0.0065\",\n"
                + "          \"qBCProd\": \"1.0000\",\n"
                + "          \"vAliqProd\": \"10.0000\"\n"
                + "        },\n"
                + "        \"ICMS\": {\n"
                + "          \"ICMS00\": {\n"
                + "            \"vICMS\": \"string\",\n"
                + "            \"CST\": \"string\",\n"
                + "            \"Orig\": \"string\",\n"
                + "            \"pICMS\": \"string\"\n"
                + "          },\n"
                + "          \"ICMS40\": {\n"
                + "            \"CST\": \"string\",\n"
                + "            \"Orig\": \"string\"\n"
                + "          },\n"
                + "          \"ICMSSN102\": {\n"
                + "            \"Orig\": \"string\",\n"
                + "            \"CSOSN\": \"string\"\n"
                + "          },\n"
                + "          \"ICMSSN900\": {\n"
                + "            \"pICMS\": \"string\",\n"
                + "            \"vICMS\": \"string\",\n"
                + "            \"Orig\": \"string\",\n"
                + "            \"CSOSN\": \"string\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"ISSQN\": {\n"
                + "          \"vDeducISSQN\": \"string\",\n"
                + "          \"vAliq\": \"string\",\n"
                + "          \"cMunFG\": \"string\",\n"
                + "          \"cListServ\": \"string\",\n"
                + "          \"cServTribMun\": \"string\",\n"
                + "          \"cNatOp\": \"string\",\n"
                + "          \"indIncFisc\": \"string\",\n"
                + "          \"vBC\": \"string\"\n"
                + "        },\n"
                + "        \"PIS\": {\n"
                + "          \"PISAliq\": {\n"
                + "            \"vPIS\": \"string\",\n"
                + "            \"CST\": \"string\",\n"
                + "            \"pPIS\": \"string\",\n"
                + "            \"vBC\": \"string\"\n"
                + "          },\n"
                + "          \"PISNT\": {\n"
                + "            \"CST\": \"string\"\n"
                + "          },\n"
                + "          \"PISOutr\": {\n"
                + "            \"vBC\": \"string\",\n"
                + "            \"qBCProd\": \"string\",\n"
                + "            \"vAliqProd\": \"string\",\n"
                + "            \"pPIS\": \"string\",\n"
                + "            \"vPIS\": \"string\",\n"
                + "            \"CST\": \"string\"\n"
                + "          },\n"
                + "          \"PISQtde\": {\n"
                + "            \"qBCProd\": \"string\",\n"
                + "            \"vAliqProd\": \"string\",\n"
                + "            \"vPIS\": \"string\",\n"
                + "            \"CST\": \"string\"\n"
                + "          },\n"
                + "          \"PISSN\": {\n"
                + "            \"CST\": \"string\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"PISST\": {\n"
                + "          \"vBC\": \"string\",\n"
                + "          \"pPIS\": \"string\",\n"
                + "          \"vPIS\": \"string\",\n"
                + "          \"qBCProd\": \"string\",\n"
                + "          \"vAliqProd\": \"string\"\n"
                + "        },\n"
                + "        \"vItem12741\": \"string\"\n"
                + "      },\n"
                + "      \"infAdProd\": \"Exemplo de mensagem informativa.\",\n"
                + "      \"prod\": {\n"
                + "        \"indRegra\": \"string\",\n"
                + "        \"vOutro\": \"string\",\n"
                + "        \"obsFiscoDet\": [\n"
                + "          {\n"
                + "            \"xCampoDet\": \"string\",\n"
                + "            \"xTextoDet\": \"string\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"cEAN\": \"string\",\n"
                + "        \"CFOP\": \"string\",\n"
                + "        \"cProd\": \"string\",\n"
                + "        \"NCM\": \"string\",\n"
                + "        \"qCom\": \"string\",\n"
                + "        \"uCom\": \"string\",\n"
                + "        \"vDesc\": \"string\",\n"
                + "        \"vUnCom\": \"string\",\n"
                + "        \"xProd\": \"string\"\n"
                + "      },\n"
                + "      \"nitem\": \"string\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"emit\": {\n"
                + "    \"indRatISSQN\": \"string\",\n"
                + "    \"CNPJ\": \"string\",\n"
                + "    \"IE\": \"string\",\n"
                + "    \"IM\": \"string\",\n"
                + "    \"cRegTribISSQN\": \"string\"\n"
                + "  },\n"
                + "  \"entrega\": {\n"
                + "    \"nro\": \"12345\",\n"
                + "    \"xCpl\": \"Complemento Exemplo\",\n"
                + "    \"xBairro\": \"Exemplo Bairro\",\n"
                + "    \"xLgr\": \"Rua Exemplo\",\n"
                + "    \"xMun\": \"Exemplo\",\n"
                + "    \"UF\": \"DF\"\n"
                + "  },\n"
                + "  \"ide\": {\n"
                + "    \"numeroCaixa\": \"1\",\n"
                + "    \"signAC\": \"SGR-SAT SISTEMA DE GESTAO E RETAGUARDA DO SAT\",\n"
                + "    \"CNPJ\": \"16716114000172\"\n"
                + "  },\n"
                + "  \"total\": {\n"
                + "    \"DescAcrEntr\": {\n"
                + "      \"vDescSubtot\": \"string\",\n"
                + "      \"vAcresSubtot\": \"string\"\n"
                + "    },\n"
                + "    \"vCFeLei12741\": \"string\"\n"
                + "  },\n"
                + "  \"pgto\": {\n"
                + "    \"mp\": [\n"
                + "      {\n"
                + "        \"cAdmC\": \"string\",\n"
                + "        \"cMP\": \"string\",\n"
                + "        \"vMP\": \"string\"\n"
                + "      }\n"
                + "    ]\n"
                + "  },\n"
                + "  \"infAdic\": {\n"
                + "    \"infCpl\": \"string\"\n"
                + "  },\n"
                + "  \"extratoResumido\": true\n"
                + "}";
        String[] args = null;
        Teste.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
