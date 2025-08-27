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
    @Test
    public void deveRetornarRotuloExcelenteParaScoreExcelente() {
        double scoreExcelente = 0.95;
        String rotuloEsperado = "Excelente";

        String rotuloCalculado = apdex.getRotulo(scoreExcelente);

        assertEquals(rotuloEsperado, rotuloCalculado);
    }

    @Test
    public void deveRetornarRotuloBomParaScoreBom() {
        double score = 0.90;
        String rotuloEsperado = "Bom";
        String rotuloCalculado = apdex.getRotulo(score);
        assertEquals(rotuloEsperado, rotuloCalculado);
    }

    @Test
    public void deveRetornarRotuloRazoavelParaScoreRazoavel() {
        double score = 0.80;
        String rotuloEsperado = "Razoável";
        String rotuloCalculado = apdex.getRotulo(score);
        assertEquals(rotuloEsperado, rotuloCalculado);
    }

    @Test
    public void deveRetornarRotuloRuimParaScoreRuim() {
        double score = 0.60;
        String rotuloEsperado = "Ruim";
        String rotuloCalculado = apdex.getRotulo(score);
        assertEquals(rotuloEsperado, rotuloCalculado);
    }

    @Test
    public void deveRetornarRotuloInaceitavelParaScoreInaceitavel() {
        double score = 0.40;
        String rotuloEsperado = "Inaceitável";
        String rotuloCalculado = apdex.getRotulo(score);
        assertEquals(rotuloEsperado, rotuloCalculado);
    }

}