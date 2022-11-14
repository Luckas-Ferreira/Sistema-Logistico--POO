import java.util.Scanner;

public class TelaCliente extends Base{

    @Override
    protected void comprarAdicionar() {
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        
    }

    @Override
    protected void removerProduto() {
        
    }

    protected void opcaoClient(){

        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o que deseja: ");
        String decisao = input.next();

        if (decisao.equals("C")){
            comprarAdicionar();
            // Rediriceso para tela de comprar item
        } else if (decisao.equals("T")){
            verTodosProduto();
        }

        
    }
    
}
