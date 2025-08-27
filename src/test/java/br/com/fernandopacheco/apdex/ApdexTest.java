// Fernando Pacheco - 555317
package br.com.fernandopacheco.apdex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void deveCalcularApdexComClassificacaoExcelente(){
        // Arrange (Preparar) [cite: 53]
        Apdex apdex = new Apdex();
        int s = 555317; // Satisfatório
        int t = 0;      // Tolerável
        int totalAmostras = 555317;
        double apdexEsperado = 1.0;

        // Act (Agir) [cite: 54]
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);

        // Assert (Validar) [cite: 55]
        Assertions.assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }
}