 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09pratica04exerc04;

import java.util.Scanner;

/**
 *
 * @author Aluno09
 */
public class AULA09Pratica04exerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o email ");
        String email = sc.nextLine();
        System.out.print("Digite o nome ");
        String nome = sc.nextLine();
        
        USUARIO X = new USUARIO();
        
        X.atribuirEmail(email);
        X.atribuirNome(nome);
        
               
        System.out.println("O email digitado é " + X.pegarEmail());
        System.out.println("O nome digitado é " + X.pegarNome());
        
    }
    
}
