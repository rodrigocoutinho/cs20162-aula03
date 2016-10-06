/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import org.junit.Test;

/**
 *
 * @author guest-w0z89b
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }

    /**
     * Test of obter method, of class Fibonacci.
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
        Fatorial.fatorial(3);
    }
}
