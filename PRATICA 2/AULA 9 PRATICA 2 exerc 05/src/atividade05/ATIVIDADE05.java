/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class ATIVIDADE05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        /**
         * Variaveis
         */
        int x;
        int y;
        
        /**
         * Solicite o usuario os valores
         */
        System.out.print("Digite o valor de x ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y ");
        y = sc.nextInt();
        
        /**
         * Chamada de metodos
         */
        CALCULADORA.soma(x,y);
        CALCULADORA.sub(x, y);
        CALCULADORA.mult(x, y);
        CALCULADORA.div(x, y);
        /**
         * Transformação dos metodos para class main
         */
       int a = CALCULADORA.soma(x, y);
       int b = CALCULADORA.sub(x, y);
       int c = CALCULADORA.mult(x,y);
       float d = CALCULADORA.div(x, y);
      
        
        /**
         * Saida de dados
         */
        System.out.println("");
        System.out.println("A soma de x e y é " + a);
        System.out.println("A subtraçao de x e y é " + b);
        System.out.println("A multiplicação de x e y é "+ c);
        System.out.println("A divisão de x e y é " + d );
        
        
    }   
    
}
