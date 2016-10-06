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
public class RegraHornerTest {
    
    public RegraHornerTest() {
    }

    /**
     * Testa a entrada de um numero inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        int a[] = {1,2,3};
        RegraHorner.polinomio(0, -1, a);
    }
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        int a[] = {1,2,3,5,6,7};
        RegraHorner.polinomio(2,3,a);
    }
    
}
