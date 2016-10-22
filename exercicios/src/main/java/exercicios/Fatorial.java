/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class Fatorial {

    /**
     * @param n : O fatorial de um número natural n.
     * @return O numero fatorado.
     * 
     */
    public static int fatorial(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 2, f = 1;

        while (i <= n) {
            f *= i;
            i++;
        }

        return (f);
    }
}
