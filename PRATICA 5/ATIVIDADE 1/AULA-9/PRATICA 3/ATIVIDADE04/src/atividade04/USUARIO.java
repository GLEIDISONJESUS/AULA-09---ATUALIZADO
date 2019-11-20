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
public class USUARIO {
    public String AT04(){
    Scanner sc = new Scanner(System.in);
        
    String nome;
            System.out.print("Digite seu nome ");
            nome = sc.nextLine();
    
    return nome;
    }
}
