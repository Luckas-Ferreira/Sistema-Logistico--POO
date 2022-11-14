public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Funcionario fu1 = new Funcionario("pedro", "lorem");
        System.out.println(login.verificar(fu1));
    }
}
