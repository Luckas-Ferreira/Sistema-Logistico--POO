public class Login implements Autenticador{
    Funcionario funcionario = new Funcionario();

    public String verificar(Funcionario funcionario){
        return verificar();
    }
    
    @Override
    public String verificar() {
        if (funcionario.getUsuario().equals(usuario) && senha.equals(senha)){
            return teste();
        }
        return "Login Invalido";
    }   
}
