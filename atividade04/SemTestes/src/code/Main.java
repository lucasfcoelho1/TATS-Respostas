/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Coelho
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o salário");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double salario = null;
        try {
            salario = reader.rea();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        System.out.println("Digite o cargo");
        String cargo = null;
        try {
            salario = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Calculadora.calcular(salario, cargo);
    }
}
