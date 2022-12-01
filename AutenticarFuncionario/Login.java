package AutenticarFuncionario;
import java.util.Scanner;
import TelaInicial.UI;

public class Login implements Autenticador{
    Scanner resposta = new Scanner(System.in);
    private LoginPadrao loginPadrao = new LoginPadrao();
    
    
    @Override
    public void verificar(Funcionario funcionario) {
        if (loginPadrao.mostrarUsuario().equals(funcionario.mostrarUsuario()) && loginPadrao.mostrarSenha().equals(funcionario.mostrarSenha())){
            System.out.println("\n--------------------\nEntrando no sistema");
            UI tela = new UI();
            tela.telaFuncionario();
        }else {
            Scanner resposta = new Scanner(System.in);
            String resp = "";
            System.out.println("Login Invalido");
            while (!resp.equals("S")){
                System.out.print("Deseja cadastrar um novo usuário? [S/N]: ");
                resp = resposta.next().toUpperCase();
                if (resp.equals("S")){
                    System.out.print("Novo Usuário: ");
                    String usuario2 = resposta.next();
                    System.out.print("Nova Senha: ");
                    String senha2 = resposta.next();
                    System.out.println("\nNovo login cadastrado!");
                    System.out.print("\nUsuário: ");
                    String novo_user = resposta.next();
                    System.out.print("Senha: ");
                    String nova_password = resposta.next();
                    if (funcionario.mostrarUsuario().equals(novo_user) && funcionario.mostrarSenha().equals(nova_password) || usuario2.equals(novo_user) && senha2.equals(nova_password)){
                        System.out.println("Entrando no sistema");
                        UI tela = new UI();
                        tela.telaFuncionario();
                    }
                    else{
                        System.out.println("Login Invalido!");
                        UI telaInit = new UI();
                        telaInit.telaInicial();
                    }
                }else if (resp.equals("N")){
                    UI telaInit = new UI();
                    telaInit.telaInicial();
                }
                resposta.close();
            }
        }        
    }
}