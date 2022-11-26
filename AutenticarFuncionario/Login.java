package AutenticarFuncionario;
import java.util.Scanner;

import Base.Color;
import TelaInicial.UI;

public class Login implements Autenticador{
    Scanner resposta = new Scanner(System.in);
    LoginPadrao loginPadrao = new LoginPadrao();
    
    
    @Override
    public void verificar(Funcionario funcionario) {
        if (loginPadrao.getUsuario().equals(funcionario.getUsuario()) && loginPadrao.getSenha().equals(funcionario.getSenha())){
            System.out.println(Color.RED + "Entrando no sistema" + Color.RESET);
            UI tela = new UI();
            tela.telaFuncionario();
        }else {
            Scanner resposta = new Scanner(System.in);
            String resp = "";
            System.out.println(Color.RED + "Login Invalido" + Color.RESET);
            while (!resp.equals("S")){
                System.out.print(Color.CYAN + "Deseja cadastrar um novo usuário? [S/N]: " + Color.RESET);
                resp = resposta.next().toUpperCase();
                if (resp.equals("S")){
                    System.out.print(Color.GREEN + "Novo Usuário: " + Color.RESET);
                    String usuario2 = resposta.next();
                    System.out.print(Color.GREEN + "Nova Senha: " + Color.RESET);
                    String senha2 = resposta.next();
                    System.out.println(Color.GREEN + "\nNovo login cadastrado!" + Color.RESET);
                    System.out.print(Color.YELLOW + "\nUsuário: " + Color.RESET);
                    String novo_user = resposta.next();
                    System.out.print(Color.YELLOW + "Senha: " + Color.RESET);
                    String nova_password = resposta.next();
                    if (funcionario.getUsuario().equals(novo_user) && funcionario.getSenha().equals(nova_password) || usuario2.equals(novo_user) && senha2.equals(nova_password)){
                        System.out.println(Color.GREEN + "Entrando no sistema" + Color.RESET);
                        UI tela = new UI();
                        tela.telaFuncionario();
                    }
                    else{
                        System.out.println(Color.RED + "Login Invalido!" + Color.RESET);
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