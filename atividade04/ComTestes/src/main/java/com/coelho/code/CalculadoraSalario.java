/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coelho.code;

import sun.nio.cs.IBM775;

/**
 *
 * @author lucas.fernandes
 */
public class CalculadoraSalario {

    public double calcular(String cargo, double salario) {
        if (cargo.equals("DESENVOLVEDOR")){
            if (salario < 3000)
                return salario * .9;
            else
                return salario * .8;
        }
        else if (cargo.equals("DBA")){
            if (salario < 2000)
                return salario * .85;
            else
                return salario * .75;
        }
            
        return 0;
    }
    
}
