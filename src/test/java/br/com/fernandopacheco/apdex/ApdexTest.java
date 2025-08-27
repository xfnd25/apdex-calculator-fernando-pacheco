// Fernando Pacheco - 555317
package br.com.fernandopacheco.apdex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    private Apdex apdex;

    @BeforeEach
    public void setUp() {
        this.apdex = new Apdex();
    }

    @Test
    public void deveCalcularApdexComClassificacaoExcelente() {
        int s = 555317;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 1.0;
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);
        assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }

    @Test
    public void deveCalcularApdexComClassificacaoBom() {
        int s = 499785;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 0.90;
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);
        assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }

    @Test
    public void deveCalcularApdexComClassificacaoRazoavel() {
        int s = 416488;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 0.75;
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);
        assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }

    @Test
    public void deveCalcularApdexComClassificacaoRuim() {
        int s = 333190;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 0.60;
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);
        assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }

    @Test
    public void deveCalcularApdexComClassificacaoInaceitavel() {
        int s = 222127;
        int t = 0;
        int totalAmostras = 555317;
        double apdexEsperado = 0.40;
        double apdexCalculado = apdex.calcularApdex(s, t, totalAmostras);
        assertEquals(apdexEsperado, apdexCalculado, 0.001);
    }
}