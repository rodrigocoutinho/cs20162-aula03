/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class Fibonacci {

    /**
     *
     * @param n: posição
     * @return
     */

    public static int obter(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int a = 0, c = 1;

        if (n == 0 || n == 1) {
            return (n);
        } else {
            int i = 2, t = 0;

            while (i <= n) {
                t = c;
                c += a;
                a = t;
                i++;
            }

            return (c);
        }
    }

}
