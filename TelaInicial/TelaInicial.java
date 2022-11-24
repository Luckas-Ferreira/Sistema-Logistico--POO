package TelaInicial;
import java.util.Scanner;

import AutenticarFuncionario.Funcionario;
import AutenticarFuncionario.Login;

public class TelaInicial {
    
    public void telaInicial(){

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
                UI cliente = new UI();
                cliente.telaCliente();
            } else if(resposta == 2){
                Login login = new Login();
                Funcionario fucionario = new Funcionario();
                login.verificar(fucionario);
                
            }else if(resposta == 3){
                System.out.println("Saindo da tela do mercadinho");
                System.exit(0);
            }
        }
    }
}
