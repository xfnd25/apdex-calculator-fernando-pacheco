// Fernando Pacheco - 555317
package br.com.fernandopacheco.apdex;

public class Apdex {

    public double calcularApdex(int s, int t, int totalAmostras) {
        return (s + (double) t / 2) / totalAmostras;
    }
}