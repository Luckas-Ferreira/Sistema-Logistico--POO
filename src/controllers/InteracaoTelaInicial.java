package controllers;

import java.util.Scanner;

import autentication.Login;

public class InteracaoTelaInicial {
   
    public void opcaoTelaInicial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Resposta: ");
        int resposta = input.nextInt();

        if (resposta == 1){
            InteraçãoTelaCliente cliente = new InteraçãoTelaCliente();
            cliente.opcoes();
            cliente.opcaoClient();
        } else if(resposta == 2){
            Login login = new Login();
            Funcionario fucionario = new Funcionario();
            login.verificar(fucionario);
                
        }else if(resposta == 3){
            System.out.println("Saindo da tela do mercadinho");
        }
        
        input.close();
    }
}
