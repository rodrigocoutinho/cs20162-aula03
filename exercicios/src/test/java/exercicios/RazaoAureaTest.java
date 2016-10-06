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
public class RazaoAureaTest {
    
    public RazaoAureaTest() {
    }

    /**
     * Testa a entrada de um numero inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        RazaoAurea.razao(-1,5,-1);
    }
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        RazaoAurea.razao(3,5,2);
    }
    
}
