public class Login implements Autenticador{
    Funcionario funcionario;

    public String verificar(Funcionario funcionario){
        return verificar();
    }
    
    @Override
    public String verificar() {
        /*if (usuario.equals(usuario) && senha.equals(senha)){
            return teste();
        }*/
        return "Login Invalido";
    }   
}
