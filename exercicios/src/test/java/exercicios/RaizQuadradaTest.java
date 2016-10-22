/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package exercicios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guest-w0z89b
 */
public class RaizQuadradaTest {
    
    public RaizQuadradaTest() {
    }

    /**
     * Testa a entrada de um numero inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        RaizQuadrada.obter(-1,0);
    }
    
    /**
     * Testa a entrada de um numero válido.
     *
     */
    @Test
    public void testNumeroValido() {
        RaizQuadrada.obter(3,2);
    }
    
}
