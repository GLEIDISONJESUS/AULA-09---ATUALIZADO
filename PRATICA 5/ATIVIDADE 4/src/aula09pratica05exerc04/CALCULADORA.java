/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica05exerc04;

/**
 *
 * @author Aluno09
 */
public class CALCULADORA {
    private float x;
    private float y;
    private float ultimoResultado; 
    
    void atribuirX(float parametro){
        x = parametro;
        
    }
    void atribuirY(float parametro){
        y = parametro;
    }
    float soma(){
        float soma;
        soma = x + y;
        ultimoResultado = soma;
        return soma;
        
    
    }
    
    void mostrarUltimoResultado(){
        System.out.println("O ultimo resultado é  " + ultimoResultado);
    }
    
}
