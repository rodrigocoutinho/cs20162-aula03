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
public class RazaoAureaTest {
    
    public RazaoAureaTest() {
    }

    /**
     * Test of obterRazao method, of class RazaoAurea.
     */
    @Test
    public void testObterRazao() {
    }
    
    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        RazaoAurea.razao(-1, 5, -1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {
        
        RazaoAurea.razao(2, 4, 2);
    }
    
}
