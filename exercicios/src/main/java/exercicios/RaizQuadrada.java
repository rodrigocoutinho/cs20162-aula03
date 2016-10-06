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
public class RaizQuadrada {

    /**
     * @param n : o numero que irá ser tirado a raiz
     * @param i : Quanto maior o valor de i maior é a aproximação da raiz
     * desejada.
     * @return : resultado da raiz
     */

    public static double obter(int n, int i) {

        if (n <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double r = 1;

        while (i >= 0) {
            r = (r + n / r) / 2;
            i--;
        }

        return (r);
    }

}
