import java.util.Scanner;
import java.util.ArrayList;
public class ListaFuncionarios {
    
    
    ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    
    public void adicionarLogin(Funcionario funcionario){
        listaFuncionario.add(funcionario);
    }
    
    public void fazerLogin(){
        for (Funcionario funcionario : listaFuncionario){
            System.out.println(funcionario);
            if (funcionario.getAdmin().equals("sim")){
                System.out.println("Login aprovado");
                //Chamar a função TelaFuncionario
            }else{
                Scanner resposta = new Scanner(System.in);
                System.out.println("Login não aprovado");
                System.out.print("Deseja cadastrar esse login? ");
                String resp = resposta.next();
                resposta.close();
                if(resp == "sim"){
                    funcionario.setAdmin("sim");
                    fazerLogin();
                    
                }else{
                    //Voltar para tela inicial
                }
            }
        
        }
    }
   
}
