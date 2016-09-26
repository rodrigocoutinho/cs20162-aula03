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
