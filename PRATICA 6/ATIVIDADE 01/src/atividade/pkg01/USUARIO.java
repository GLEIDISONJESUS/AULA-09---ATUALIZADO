/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg01;

/**
 *
 * @author gleidison.santos
 */
public class USUARIO {
    private String email;
    private String nome;
    private String senha; 
   
    public void atribuirEmail(String email){
        this.email = email;
}
    public void atribuirNome (String nome){
        this.nome = nome;
    }
    public void atribuirSenha(String senha){
        this.senha = senha;
    }
    public String pegarEmail(){
       return email;
    }
    public String pegarNome (){
        return nome;
    }
    public String pegarSenha(){
        return senha;
    }
    
    
    
    
}
 