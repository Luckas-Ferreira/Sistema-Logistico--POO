import java.util.Scanner;

public class Verificador extends Funcionario {
    public void fazerLogin(){
        Funcionario funcionario = new Funcionario();
        LoginPadrao loginPadrao = new LoginPadrao();
        System.out.println("Usuario padrão: " + this.usuario);
        System.out.println("Tentativa de login: " + funcionario.getUsuario());
        if (funcionario.getUsuario().equals(loginPadrao.getUsuario()) && funcionario.getSenha().equals(loginPadrao.getSenha())){
            System.out.println("Entrando no sistema");
            //Mandar para a tela funcionario
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
                    System.out.println("Novo login cadastrado!");
                    System.out.print("Usuário: ");
                    String novo_user = resposta.next();
                    System.out.print("Senha: ");
                    String nova_password = resposta.next();
                    if (funcionario.getUsuario().equals(novo_user) && funcionario.getSenha().equals(nova_password) || usuario2.equals(novo_user) && senha2.equals(nova_password)){
                        System.out.println("Entrando no sistema");
                        //Mandar para a tela funcionario
                    }
                    else{
                        System.out.println("Login Invalido!");
                        //Mandar para a tela inicial
                    }    
                resposta.close();
                }
            }
        }                   
    }
}
