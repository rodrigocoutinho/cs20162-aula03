/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class RazaoAurea {

    /**
     * @param x : 1o
     * @param y : 2o
     * @param k : sequencia
     * @return : A razão áurea
     */

    public static double razao(int x, int y, int k) {
        if (x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double c = y, a = x, t;
        int i = 1;
        while (i <= k) {
            t = c;
            c += a;
            a = t;
            i++;
        }

        return (c / a);
    }

}
