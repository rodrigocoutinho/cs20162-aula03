/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import org.junit.Test;

/**
 *
 * @author Shakaw
 */
public class RaizQuadradaTest {
    
    public RaizQuadradaTest() {
    }

    /**
     * Test of obter method, of class RaizQuadrada.
     */
    @Test
    public void testObter() {
    }
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        RaizQuadrada.obter(-1, -1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {

        RaizQuadrada.obter(5, 2);
    }
}
