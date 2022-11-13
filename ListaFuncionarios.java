import java.util.ArrayList;
public class ListaFuncionarios {
    ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    
    public void adicionarLogin(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }

    public void listarLogin(){
        for (Funcionario funcionario : listaFuncionario){ //Chamada Enhanced for-loop para percorrer toda a lista.  
            System.out.println("Usuario: " + funcionario.getUsuario());
            if (funcionario.getUsuario() != "login"){
                System.out.println("Login não aprovado");
            }else{
                System.out.println("Login aprovado");
            }
        }
    }
}
