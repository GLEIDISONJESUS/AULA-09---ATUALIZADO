/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class ATIVIDADE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nome;
        /**
         * Solicitaçao de dados pelo usuario
         */
        System.out.print("Digite seu nome ");
        nome = sc.nextLine();
        
        /**
         * CHAMADA DE METODO USUARIO 
         */
        USUARIO X = new USUARIO();
        X.AT03(nome);
        
    }
    
}
