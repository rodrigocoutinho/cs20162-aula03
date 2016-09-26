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
public class RestoDaDivisaoTest {

    public RestoDaDivisaoTest() {
    }

    @Test
    public void testSomeMethod() {
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {

        RestoDaDivisao.obterResto(-1, 0);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {

        RestoDaDivisao.obterResto(5, 2);
    }

}
