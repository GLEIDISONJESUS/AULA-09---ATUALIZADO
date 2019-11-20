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
        Scanner sc = new Scanner(System.in);
        /**
         * VARIAVEIS
         */
        int x;
        int y;
        
        /**
         * Solicitaçao de dados pelo usuario
         */
        System.out.print("Digite o valor de x ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y ");
        y = sc.nextInt();
        
        /**
         * Chamada de metodos
         */
       CALCULADORA a = new CALCULADORA();
       
       
          
        
        /**
         * Saida de dados
         */
        System.out.println("A soma é " + a.soma(x, y));
        System.out.println("A subtraçao é " + a.sub(x, y));
        System.out.println("A multiplicaçao é " + a.mult(x, y));
        System.out.println("A divisão é " + a.div(x, y));
        
    }
    
}
