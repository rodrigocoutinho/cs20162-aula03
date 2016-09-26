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
public class SomatorioElementar {

    /**
     * @param n: Quantidade de numeros a serem somados
     * @return Um somatório envolvendo os primeiros naturais
     */
    public static int soma(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 1, s = 0, d = 0;

        while (i <= n) {
            d = 1 + (i * i);
            s += 1 / d;
            i++;
        }

        return (s);
    }

}