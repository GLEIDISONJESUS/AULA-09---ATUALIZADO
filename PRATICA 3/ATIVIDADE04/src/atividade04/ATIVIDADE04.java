/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

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
       
        // Instanciar um objeto da classe USUARIO
        USUARIO y = new USUARIO();
        
        //usar o objeto y para chamar o metodo e armazenar o valor
        //retornado em uma variavel local
        String variavelLocal = y.AT04();
        
        System.out.println("O Digitado é " + variavelLocal);
        
    }
    
}
