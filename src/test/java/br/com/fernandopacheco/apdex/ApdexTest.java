// Fernando Pacheco - 555317
package br.com.fernandopacheco.apdex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void deveCalcularApdexComClassificacaoExcelente(){
        Apdex apdex = new Apdex();
        int s = 555317;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 1.0;

        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);

        Assertions.assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }
}