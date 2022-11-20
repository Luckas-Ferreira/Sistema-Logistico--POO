package controllers;
import java.util.Scanner;
public class Funcionario{
    Scanner login = new Scanner(System.in);
    protected String usuario;
    protected String senha;
    
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
}
