import java.util.Scanner;

public class TelaCliente extends Cliente{
    // A tela cliente mostrará as interações que o cliente podera realizar.
    // *AINDA A DECIDIR SE EXISTIRA UM VERIFICADOR DE CLIENTE*
     


    public TelaCliente(String nome, int idade, double dinheiro) {
        super(nome, idade, dinheiro);
    }

    protected void opcaoClient(){

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next().toUpperCase();
            
            if (decisao.equals("C")){
                adicionarProduto();
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
