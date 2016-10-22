/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class Pi {

    /**
     * @param n: O valor de Pi é dado pelo somatório de n
     * @return Pi
     */
    public static long pi(long n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 1;
        long s = -1, d = -1, p = 0;

        while (i <= n) {
            d = d + 2;
            s *= (-1);
            p += (4 * s / d);
            i++;
        }

        return (p);
    }

}
