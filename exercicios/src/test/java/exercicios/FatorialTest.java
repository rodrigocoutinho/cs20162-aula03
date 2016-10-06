/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import org.junit.Test;

/**
 *
 * @author Rodrigo
 */
public class FatorialTest {

    public FatorialTest() {

    }

    /**
     * Testa um numero inválido.
     *
     * @throws java.lang.Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        Fatorial.fatorial(-1);
    }

    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        Fatorial.fatorial(3);
    }
}
