/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class SomatorioElementar {

    /**
     * @param n: Quantidade de numeros a serem somados
     * @return Um somatório envolvendo os primeiros naturais
     */
    public static int soma(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 1, s = 0, d = 0;

        while (i <= n) {
            d = 1 + (i * i);
            s += 1 / d;
            i++;
        }

        return (s);
    }

}