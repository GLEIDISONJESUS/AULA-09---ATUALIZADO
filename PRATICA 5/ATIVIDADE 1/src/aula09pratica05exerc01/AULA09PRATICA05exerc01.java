/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica05exerc01;

import java.util.Scanner;

/**
 *
 * @author Aluno09
 */
public class AULA09PRATICA05exerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CALCULADORA a = new CALCULADORA();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de x ");
        a.x = sc.nextInt();
        System.out.print("Digite o valor de y ");
        a.y = sc.nextInt();
        
        a.soma();
        a.sub();
        a.mult();
        a.div();
    }
    
}
