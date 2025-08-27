// Fernando Pacheco - 555317
package br.com.fernandopacheco.apdex;

public class Apdex {

    public double calcularApdex(int s, int t, int totalAmostras) {
        return (s + (double) t / 2) / totalAmostras;
    }

    public String getRotulo(double score) {
        if (score >= 0.94) {
            return "Excelente";
        } else if (score >= 0.85) {
            return "Bom";
        } else if (score >= 0.70) {
            return "Razoável";
        } else if (score >= 0.50) {
            return "Ruim";
        } else {
            return "Inaceitável";
        }
    }
}