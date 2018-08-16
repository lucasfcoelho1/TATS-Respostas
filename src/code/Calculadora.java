/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Coelho
 */
public class Calculadora {
    
    public Calculadora(){
    }
    
    public static double calcular(double salario, String cargo){
        if(cargo.equals("DESENVOLVEDOR")){
            if(salario >= 3000)
                return salario * .8;
            else
                return salario * .9;
        }
        else if(cargo.equals("DBA")){
            if(salario >= 2000)
                return salario * .75;
            else
                return salario * .85;
        }
        else if(cargo.equals("TESTADOR")){
            if(salario >= 2000)
                return salario * .75;
            else
                return salario * .85;
        }
        else if(cargo.equals("GERENTE")){
            if(salario >= 5000)
                return salario * .7;
            else
                return salario * .8;
        }
           return 0; 
    }
    
}
