package Base;

import java.util.Scanner;

import AutenticarFuncionario.Funcionario;
import AutenticarFuncionario.Login;
import TelaInicial.UI;

public class Iniciar{
    public void telaCliente(){
        UI cliente = new UI();
        cliente.telaCliente();
    };
    public void telaFuncionario(){
        Login login = new Login();
        Funcionario fucionario = new Funcionario();
        login.verificar(fucionario);
    }

    public void sair(){
        System.out.println("Saindo do programa");
    }
    
    public void opcao(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("==========================================");
            System.out.print("Escolha o que deseja: ");
            String decisao = input.nextLine().toUpperCase();
            if (decisao.equals("1")){
                telaCliente();
            }else if (decisao.equals("2")){
                telaFuncionario();
            } else if (decisao.equals("3")){
                sair();
                break;
            }
        }
        
    }
}
