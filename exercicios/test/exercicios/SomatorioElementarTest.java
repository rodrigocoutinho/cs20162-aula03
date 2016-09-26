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
public class SomatorioElementarTest {

    /**
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void NumeroInvalidoMenor1() {

        SomatorioElementar.soma(-1);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {
        
        SomatorioElementar.soma(5);
    }
}
