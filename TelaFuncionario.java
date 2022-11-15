import java.util.Scanner;

public class TelaFuncionario extends Base{
    
    public TelaFuncionario(){
        System.out.println("\n\n\tTELA DO FUNCIONARIO\n");
    }
    
    @Override
    protected void adicionarProduto() {
        
        System.out.println("[ A ] Adicionar um produto  [ A ]");
        
    }

    @Override
    protected void removerAdicionar() {
        System.out.println("[ R ]  Remover um produto   [ R ]");
        
    }

    protected void opcaoClient(){
        Scanner input = new Scanner(System.in);
        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next().toUpperCase();
            
            if (decisao.equals("A")){
                adicionarProduto();
                // Rediriceso para tela de comprar item
            } else if (decisao.equals("R")){
                removerAdicionar();
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