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
        int x;
        int y;
        /**
         * Usuários digita os valores
         */
        System.out.print("Digite o valor de x ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y ");
        y= sc.nextInt();
        
        /**
         * Chamada de metodos
         */
        soma(x,y);
        sub(x,y);
        mult(x,y);
        div(x,y);
                
        
        /**
         * Saída de dados
         */
        System.out.println("A soma de x e y é " + soma(x,y));
        System.out.println("A subtração de x e y é " + sub(x,y));
        System.out.println("A multiplicação de x e y é " + mult(x,y));
        System.out.println("A divisão de x e y é " + div(x,y));

    }
    
    
    public static int soma(int x, int y) {
        int soma = x + y;

        return soma;
    }
    public static int sub(int x, int y) {
        int sub = x - y;

        return sub;
    }
    public static int mult(int x, int y) {
        int mult = x * y;

        return mult;
    }
    public static float div(float x, int y) {
        float div =  x / y;

        return div;
    }
    
}
