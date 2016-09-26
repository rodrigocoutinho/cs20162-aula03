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
public class FatorialTest {
    
    public FatorialTest() {
    }

    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumeroInvalidoMenor1() {

        Fatorial.fatorial(-1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {
        
        Fatorial.fatorial(2);
    }
    
}
