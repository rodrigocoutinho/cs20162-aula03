/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

import org.junit.Test;

/**
 *
 * @author guest-w0z89b
 */
public class QuadradoPerfeitoTest {

    /**
     * Testa a entrada de um numero inválido.
     *
     * @throws java.lang.Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testQuadrado() throws Exception {
        QuadradoPerfeito.quadrado(-1);
    }

    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        QuadradoPerfeito.quadrado(3);
    }

}
