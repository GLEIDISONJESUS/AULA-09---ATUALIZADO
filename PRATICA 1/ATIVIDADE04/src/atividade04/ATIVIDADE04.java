/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class ATIVIDADE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println("A mensagem digitada pelo usuario é "  + AT4());
        
    }  
    
    public static String AT4(){
       Scanner sc = new Scanner(System.in);
       String x = new String();
       System.out.print("Digite um mensagem ");
       x = sc.nextLine();
       return x;
}     
}