package AutenticarFuncionario;
import java.util.Scanner;
public class Funcionario{
    protected String usuario;
    protected String senha;
    
    Scanner login = new Scanner(System.in);
    public Funcionario(){
        System.out.print("\nUsuario: ");
        this.usuario = login.next();
        System.out.print("Senha: ");
        this.senha = login.next();
    }
    
    public String mostrarSenha() {
        return senha;
    }
    public String mostrarUsuario(){
        return usuario;
    }
    public void alterarSenha(String senha) {
        this.senha = senha;
    }
    public void alterarUsuario(String usuario){
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "Funcionario [usuario=" + usuario + ", senha=" + senha + "]";
    }

}
