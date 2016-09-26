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
public class RegraHorner {

    /**
     * @param x
     * @param g
     * @param a
     * @return
     */

    public static int polinomio(int x, int g, int a[]) {

        if (g < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int p = a[0];
        int i = g - 1;
        while (i >= 0) {
            p = p * x + a[i];
            i--;
        }

        return (p);

    }
}
