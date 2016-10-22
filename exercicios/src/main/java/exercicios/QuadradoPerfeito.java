/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

/**
 *
 * @author Rodrigo
 */
public class QuadradoPerfeito {

    /**
     * @param k : verifica se numero é quadrado perfeito.
     * @return : O algoritmo abaixo retorna verdadeiro se o número fornecido é
     * um quadrado perfeito.
     */
    public static boolean quadrado(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 1, q = 1;
        while (q < k) {
            i += 2;
            q += i;
        }

        return (q == k);
    }

}
