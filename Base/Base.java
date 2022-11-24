package Base;

import java.util.Scanner;

import PRODUTO.Produtos;
import TelaInicial.TelaInicial;

public abstract class Base{
    public abstract void adicionarProduto();
    public abstract void removerComprar();

    public void verTodosProduto(){
        Produtos produto = new Produtos();
        produto.ProdutosCadastrados();
        produto.VerProdutos();
    }
    public void pesquisarProtuto(){
        Produtos produto = new Produtos();
        produto.ProdutosCadastrados();
        produto.pesquisarProduto(null);
    }
    public void voltar(){
        TelaInicial tela = new TelaInicial();
        tela.telaInicial();
    }
    public void sair(){
        System.out.println("Saindo do programa");
    }
    
    
    public void opcao(){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\n==========================================\n");
            System.out.print("Escolha o que deseja: ");
            String decisao = input.nextLine().toUpperCase();
            if (decisao.equals("C")){
                removerComprar();
            }else if (decisao.equals("R")){
                removerComprar();
            }if (decisao.equals("A")){
                adicionarProduto();
            }else if (decisao.equals("T")){
                verTodosProduto();
            }else if (decisao.equals("P")){
                pesquisarProtuto();
            } else if (decisao.equals("V")){
                voltar();
            } else if (decisao.equals("S")){
                sair();
                break;
            }
        }
        
    }
}
