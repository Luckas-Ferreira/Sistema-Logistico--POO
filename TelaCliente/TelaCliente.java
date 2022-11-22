package TelaCliente;
import java.util.Scanner;

import Base.Base;
import TelaInicial.TelaInicial;

public class TelaCliente extends Base{
    // A tela cliente mostrará as interações que o cliente podera realizar.
    // *AINDA A DECIDIR SE EXISTIRA UM VERIFICADOR DE CLIENTE*
     
    public TelaCliente(){
        System.out.println("\n\n\tTELA DO CLIENTE\n");
    }

    @Override
    protected void adicionarProduto() {
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        
    }

    @Override
    protected void removerAdicionar() {
        
        
    }


    public void opcaoClient(){

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next().toUpperCase();
            
            if (decisao.equals("C")){
                adicionarProduto();
                // Ir para tela de comprar item
            } else if (decisao.equals("T")){
                verTodosProduto();
                // Mostrar produtos disponiveis 
            } else if (decisao.equals("P")){
                pesquisarProtuto();
                // Pesquisar um produto
            } else if (decisao.equals("V")){
                TelaInicial tela = new TelaInicial();
                tela.telaInial();
            } else if (decisao.equals("S")){
                sair();
                break;
                // Sai do mercadinho
            }

        }
        input.close();
    }

    
    
}
