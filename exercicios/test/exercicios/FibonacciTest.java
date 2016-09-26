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
public class FibonacciTest {

    public FibonacciTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        Fibonacci.obter(-1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {

        Fibonacci.obter(2);
    }

}
