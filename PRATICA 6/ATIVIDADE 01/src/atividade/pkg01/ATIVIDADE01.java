/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gleidison.santos
 */
public class ATIVIDADE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<USUARIO> USUARIO = new ArrayList();

        System.out.println("========Cadastro de USUÁRIO========");

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o email ");
            String email = sc.nextLine();
            System.out.print("Digite a senha ");
            String senha = sc.nextLine();
            System.out.print("Digite seu nome ");
            String nome = sc.nextLine();
            System.out.println("");

            USUARIO u = new USUARIO();
            u.atribuirEmail(email);
            u.atribuirNome(nome);
            u.atribuirSenha(senha);

            USUARIO.add(u);

        }
        System.out.println("========DADOS DOS USUÁRIOS========");
        for(int i = 0; i < USUARIO.size(); i++){
            USUARIO uTemp = USUARIO.get(i);
            
            System.out.println("O email é " + uTemp.pegarEmail());
            System.out.println("O nome  é " + uTemp.pegarNome());
            System.out.println("A senha é " + uTemp.pegarSenha());
            System.out.println("");
            
        }

    }

}
