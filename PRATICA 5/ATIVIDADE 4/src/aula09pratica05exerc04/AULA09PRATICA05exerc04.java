/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica05exerc04;

import java.util.Scanner;

/**
 *
 * @author Aluno09
 */
public class AULA09PRATICA05exerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite x ");
        float x = sc.nextInt();
        System.out.print("Digite y ");
        float y = sc.nextInt();
        
        CALCULADORA A = new CALCULADORA();
        
        A.atribuirX(x);
        A.atribuirY(y);
        
        A.soma();
       
        
        System.out.println("A soma é " + A.soma());
        
        
        
         A.mostrarUltimoResultado();
        
    }
    
}
