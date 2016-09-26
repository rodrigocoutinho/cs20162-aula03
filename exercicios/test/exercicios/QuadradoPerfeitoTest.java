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
public class QuadradoPerfeitoTest {
    
    public QuadradoPerfeitoTest() {
    }

    /**
     * Test of quadrado method, of class QuadradoPerfeito.
     */
    @Test
    public void testQuadrado() {
    }
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        QuadradoPerfeito.quadrado(-3);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {

        QuadradoPerfeito.quadrado(4);
    }
    
    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalido() {

        QuadradoPerfeito.quadrado(-5);
    }
    
    /**
     *
     */
    @Test
    public void numeroValido2() {
        
        QuadradoPerfeito.quadrado(9);
    }
}
