/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9pratica05exerc03;

import java.util.Scanner;

/**
 *
 * @author Aluno09
 */
public class AULA9PRATICA05exerc03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de x ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y ");
        int y = sc.nextInt();
        
        CALCULADORA A = new CALCULADORA();
        
        
        A.atribuirX(x);
        A.atribuirY(y);
        
        
        
        System.out.println("A soma de x e y é " + A.soma());
        System.out.println("A subtração de x e y é " + A.sub());
        System.out.println("A multiplicação de x e y é " + A.mult());
        System.out.println("A divisão de x e y é "+A.div());
        
    }
    
}
