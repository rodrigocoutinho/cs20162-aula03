/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author guest-w0z89b
 */
public class FibonacciTest {

    /**
     * Test of obter method, of class Fibonacci.
     * @throws java.lang.Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        Fibonacci.obter(-1);
    }

    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        Fibonacci.obter(3);
    }
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido2() {
        assertEquals(2, Fibonacci.obter(3),0);
    }
}
