/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.util.Scanner;

/**
 *
 * @author Gleidson
 */
public class USUARIO {
    private String email;
    private String nome;
    
    void pedirEmail(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu email ");
        email = sc.nextLine();
    }
    void pedirNome (){
    Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome ");
        nome = sc. nextLine();
    }
    void mostrarEmail(){
        System.out.println("O email digitado é " + email);
    }
    void mostrarNome(){
        System.out.println("O nome digitado é " + nome);
    }
}
