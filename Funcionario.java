import java.util.Scanner;
public class Funcionario {
    protected String usuario;
    protected String senha;
    
    Scanner login = new Scanner(System.in);
    public Funcionario(){
        System.out.print("Usuario: ");
        this.usuario = login.next();
        System.out.print("Senha: ");
        this.senha = login.next();
        
    }
    
    public String getSenha() {
        return senha;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "Funcionario [usuario=" + usuario + ", senha=" + senha + "]";
    }

}
