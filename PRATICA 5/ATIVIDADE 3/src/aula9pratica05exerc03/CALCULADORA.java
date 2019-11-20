/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9pratica05exerc03;

/**
 *
 * @author Aluno09
 */
public class CALCULADORA {
    private float x;
    private float y;
    
    void atribuirX (float parametro){
     x = parametro;
        
    }
    void atribuirY (float parametro){
        y = parametro;
    }
    float soma(){
        float soma;
        soma = x + y;
        return soma;
    }
    float sub(){
        float sub;
        sub = x-y;
        return sub;
    }
    float mult(){
        float mult;
        mult = x*y;
        return mult;
    }
    float div(){
        float div;
        div = x/y;
        return div;
    }
    
    
}
