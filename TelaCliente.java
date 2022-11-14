import java.util.Scanner;

public class TelaCliente extends Base{

    @Override
    protected void adicionarProduto() {
        //Cliente não pode adicionar produto
    }

    @Override
    protected void removerAdicionar() {
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        
    }

    protected void opcaoClient(){

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next().toUpperCase();
            
            if (decisao.equals("C")){
                removerAdicionar();
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
