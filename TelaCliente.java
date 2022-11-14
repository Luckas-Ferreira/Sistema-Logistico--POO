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

        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next();
            
            if (decisao.equals("C")){
                comprarAdicionar();
                // Rediriceso para tela de comprar item
            } else if (decisao.equals("T")){
                verTodosProduto();
            } else if (decisao.equals("P")){
                pesquisarProtuto();
            } else if (decisao.equals("V")){
                voltar();
            } else if (decisao.equals("S")){
                sair();
                break;
            }

        }
        input.close();
    }
    
}
