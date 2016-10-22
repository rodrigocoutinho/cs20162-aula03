/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

import static exercicios.Fatorial.fatorial;
import static java.lang.Math.pow;

/**
 *
 * @author Rodrigo
 */
public class LogaritmoNatural {

    /**
     * @param n : logaritimo natural
     * @param k : aproximação
     * @return : logaritmo
     */

    public static double log(int n, int k) {

        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 2;
        double e = n + 1, p, f;

        while (i <= k) {
            p = pow(n, i);
            f = fatorial(i);
            e += p / f;
            i++;
        }

        return (e);
    }

}
