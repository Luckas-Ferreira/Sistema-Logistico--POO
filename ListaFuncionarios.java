import java.util.ArrayList;
public class ListaFuncionarios {
    protected String loginPadrao;
    
    public String getLoginPadrao() {
        loginPadrao = "Admin";
        return loginPadrao;
    }

    ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    
    public void adicionarLogin(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }
    
    public void fazerLogin(){
        for (Funcionario funcionario : listaFuncionario){
            System.out.println(funcionario);
            if (this.getLoginPadrao().equals(funcionario.getUsuario())){
                System.out.println("Login aprovado");
                //Chamar a função TelaFuncionario
            }else{
                //System.out.println("Login não aprovado");
                
            }
        }
    }
}
