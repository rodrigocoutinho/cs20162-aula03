/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
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
