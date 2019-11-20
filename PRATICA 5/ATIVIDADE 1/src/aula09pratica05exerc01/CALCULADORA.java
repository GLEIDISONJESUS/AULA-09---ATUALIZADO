/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica05exerc01;

/**
 *
 * @author Aluno09
 */
public class CALCULADORA {
   float x;
   float y;
    
   void  soma(){
       float soma;
       soma = x+y;
       System.out.println("A soma de x e y é " + soma);       
    }
   void sub(){
       float sub;
       sub = x-y;
       System.out.println("A subtração de x e y é " + sub);
    
   }
   void mult (){
       float mult;
       mult = x*y;
       System.out.println("A multiplicação de x e y é "+mult);
    }
   void div(){
       float div;
       div = x/y;
       System.out.println("A divisão de x e y é " + div);
   }
   
   
   
}
