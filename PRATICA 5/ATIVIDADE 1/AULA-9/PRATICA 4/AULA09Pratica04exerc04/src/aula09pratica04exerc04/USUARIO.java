/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica04exerc04;

/**
 *
 * @author Gleidson
 */
public class USUARIO {
    private String email;
    private String nome;
    
    void atribuirEmail(String parametro){
        email = parametro;
    
    }
    void atribuirNome(String parametro){
        nome = parametro;
    }
    
     String pegarEmail(){
        return email;
        
        
    }
     String pegarNome(){
        
        return nome;
    }
    
}
