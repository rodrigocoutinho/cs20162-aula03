/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
