package AutenticarFuncionario;
public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Funcionario fu1 = new Funcionario();
        login.verificar(fu1);
    }
}
