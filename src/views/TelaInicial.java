package views;
import java.util.Scanner;

import autentication.Login;
import controllers.Funcionario;
import controllers.InteraçãoTelaCliente;

public class TelaInicial {
    
    public void start(){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\n\tMercadinho do Thiago\n");
            System.out.println("Você é um consumidor?");
            System.out.println("Você é um funcionario?");
            System.out.println("\n\t[1]   Consumidor   [1]");
            System.out.println("\t[2]  Funcionario   [2]");
            System.out.println("\t[3]      SAIR      [3]\n");

            System.out.print("Resposta: ");
            int resposta = input.nextInt();

            if (resposta == 1){
                InteraçãoTelaCliente cliente = new InteraçãoTelaCliente(null, resposta, resposta);
                cliente.opcoes();
                cliente.opcaoClient();
            } else if(resposta == 2){
                Login login = new Login();
                Funcionario fucionario = new Funcionario();
                login.verificar(fucionario);
                
            }else if(resposta == 3){
                System.out.println("Saindo da tela do mercadinho");
                
            }
        }
    }
}
