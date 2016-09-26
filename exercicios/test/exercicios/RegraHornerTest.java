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
public class RegraHornerTest {

    public RegraHornerTest() {
    }
    
    int n[] = {1, 2, 3, 4, 5};

    @Test
    public void testSomeMethod() {
    }

    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoMenor1() {
        

        RegraHorner.polinomio(-1, -1, n);
    }

    /**
     *
     */
    @Test
    public void numeroValido() {

        RegraHorner.polinomio(5, 2, n);
    }

}
