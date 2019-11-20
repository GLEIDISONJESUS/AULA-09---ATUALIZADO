/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class ATIVIDADE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        USUARIO objetoUSUARIO = new USUARIO();
        
        System.out.print("Digite seu nome ");
        objetoUSUARIO.nome = sc.nextLine();
        System.out.print("Digite seu email ");
        objetoUSUARIO.email = sc.nextLine();
        System.out.println("");
                
        System.out.println("O nome digitado é " + objetoUSUARIO.nome);
        System.out.println("O email digitado é " + objetoUSUARIO.email);
        
    }
    
}
