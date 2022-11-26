package AutenticarFuncionario;
import java.util.Scanner;

import Base.Color;
public class Funcionario{
    protected String usuario;
    protected String senha;
    
    Scanner login = new Scanner(System.in);
    public Funcionario(){
        System.out.print(Color.YELLOW + "Usuario: " + Color.RESET);
        this.usuario = login.next();
        System.out.print(Color.YELLOW + "Senha: " + Color.RESET);
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
