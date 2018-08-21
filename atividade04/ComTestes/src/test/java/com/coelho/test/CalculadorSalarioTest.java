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
        assertEquals(2250.0, c.calcular("DESENVOLVEDOR", 2500.0), 0.001);
    }
    
    @Test
    public void testDesenvolvedorMaiorTresMil(){
        assertEquals(2800, c.calcular("DESENVOLVEDOR", 3500.0), 0.001);
    }
    
    @Test
    public void testDBAMenorDoisMil(){
        assertEquals(1530, c.calcular("DBA", 1800.0), 0.001);
    }
    
    @Test
    public void testDBAMaiorrDoisMil(){
        assertEquals(1875, c.calcular("DBA", 2500.0), 0.001);
    }
    
    @Test
    public void testTestadorMenorDoisMil(){
        assertEquals(1530, c.calcular("TESTADOR", 1800.0), 0.001);
    }
    
    @Test
    public void testTestadorMaiorrDoisMil(){
        assertEquals(1875, c.calcular("TESTADOR", 2500.0), 0.001);
    }
}
