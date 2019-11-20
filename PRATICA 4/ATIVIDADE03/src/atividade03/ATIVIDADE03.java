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
        String email;
        String nome;
        
        System.out.print("Digite o seu email ");
        email = sc.nextLine();
        System.out.print("Digite o seu nome ");
        nome = sc.nextLine();
        
        USUARIO objetoUSUARIO = new USUARIO();
        objetoUSUARIO.atribuirEmail(email);
        objetoUSUARIO.atribuirNome(nome);
        
        objetoUSUARIO.mostrarEmail();
        objetoUSUARIO.mostrarNome();
        
        
        
    }
    
}
