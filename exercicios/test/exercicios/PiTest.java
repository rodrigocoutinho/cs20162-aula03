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
public class PiTest {
    
    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        Pi.pi(-1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {
        
        Pi.pi(2);
    }
}