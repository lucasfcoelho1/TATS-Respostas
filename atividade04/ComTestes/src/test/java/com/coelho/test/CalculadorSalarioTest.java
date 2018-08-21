/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coelho.test;

import com.coelho.code.CalculadoraSalario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *git
 * @author lucas.fernandes
 */
public class CalculadorSalarioTest {
    
    @Test
    public void testDesenvolvedorMenorTresMil(){
        CalculadoraSalario c = new CalculadoraSalario();
        assertEquals(2000.0, c.calcular("DESENVOLVEDOR", 2500.0), 0.001);
        
    }
}
