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
public class RestoDaDivisao {

    /**
     * @param x : numero a ser dividido.
     * @param y : divisor
     * @return : resultado do resto da divisão
     */
    public static int obterResto(int x, int y) {

        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int s = x;

        while (y <= s) {
            s -= y;
        }

        return (s);
    }

}
