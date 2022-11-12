public class Funcionario implements Autenticador{
    public String teste(){
        return "Login Aprovado";
    }
    private String usuario;
    private String senha;

    public Funcionario(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String verificar() {
        if (usuario.equals(usuario) && senha.equals(senha)){
            return teste();
        }
        return "Login Invalido";
    }
    
}
