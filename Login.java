import java.util.Scanner;
import java.util.function.Function;

public class Login {
    public static void main(String[] args) {
        Scanner acesso = new Scanner(System.in);
        Funcionario login = new Funcionario();
        System.out.print("Usuario: ");
        login.setUsuario(acesso.next());
        System.out.print("Senha: ");
        login.setSenha(acesso.next());
        acesso.close();
    }
}

