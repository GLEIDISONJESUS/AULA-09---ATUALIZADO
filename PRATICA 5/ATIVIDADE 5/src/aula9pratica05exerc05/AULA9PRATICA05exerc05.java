/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9pratica05exerc05;

import java.util.Scanner;

/**
 *
 * @author gleidison.santos
 */
public class AULA9PRATICA05exerc05 {

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
        
        A.soma(x, y);
        A.sub(x, y);
        A.mult(x, y);
        A.div(x, y);
        A.mostrarUltimaOperacao();
        
        System.out.println("A soma é " + A.soma(x, y) );
        System.out.println("A subtração é " + A.sub(x,y));
        System.out.println("A multiplicação é " + A.mult(x, y));
        System.out.println("A divisão é " + A.div(x, y));
        
        
    }
    
}
