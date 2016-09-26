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
