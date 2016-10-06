/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guest-w0z89b
 */
public class LogaritmoNaturalTest {
    
    public LogaritmoNaturalTest() {
    }

    /**
     * Testa numeros inválidos.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        LogaritmoNatural.log(-1,1);
    }
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        LogaritmoNatural.log(3,5);
    }
    
}
