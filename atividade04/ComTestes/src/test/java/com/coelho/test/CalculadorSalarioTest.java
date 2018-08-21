/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coelho.test;

import com.coelho.code.CalculadoraSalario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * git
 *
 * @author lucas.fernandes
 */
public class CalculadorSalarioTest {

    CalculadoraSalario c;

    @Before
    public void before() {
        c = new CalculadoraSalario();
    }

    @Test
    public void testDesenvolvedorMenorTresMil() {

        assertEquals(2000.0, c.calcular("DESENVOLVEDOR", 2500.0), 0.001);
    }
}
