/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Rodrigo
 */
public class FatorialTest {

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
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido2() {
        assertEquals(6,Fatorial.fatorial(3),0);
    }
}
