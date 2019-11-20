/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9pratica05exerc05;

/**
 *
 * @author gleidison.santos
 */
public class CALCULADORA {
    
    private float ultimoX;
    private float ultimoY;
    private String ultimaOperacao;
    private float ultimoResultado;
    
   public float soma(float parametro, float retorno){
       float soma = ultimoX + ultimoY; 
       
       ultimoX = parametro;
        ultimoY = retorno;
        ultimaOperacao = "+";
        ultimoResultado = soma;
        return soma;
    }
    public float sub (float parametro, float retorno){
        float sub = ultimoX - ultimoY;
        
        ultimoX = parametro;
        ultimoY = retorno;
        ultimaOperacao ="-";
        ultimoResultado = sub;
        return sub;
    }
   public float mult (float parametro, float retorno){
        float mult = ultimoX * ultimoY;
        
        ultimoX = parametro;
        ultimoY = retorno;
        ultimaOperacao ="*";
        ultimoResultado = mult;
        return mult;
    }
   public float div (float parametro, float retorno){
        float div = ultimoX / ultimoY;
        ultimoX = parametro;
        ultimoY = retorno;
        ultimaOperacao ="/";
        ultimoResultado = div;
        return div;
    }
   public void mostrarUltimaOperacao(){
       System.out.println("O valor de x é " + ultimoX);
       System.out.println("O valor de y é " + ultimoY);
       System.out.println("O valor da ultima operação é " + ultimaOperacao);
       System.out.println("O valor do ultimo resultado é  " + ultimoResultado);
   }
   
}
