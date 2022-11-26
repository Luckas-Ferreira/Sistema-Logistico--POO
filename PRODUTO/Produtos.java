package PRODUTO;

import java.util.ArrayList;
import java.util.Scanner;

import SobreCLiente.CadastroCliente;
import SobreCLiente.Cliente;

public class Produtos{
    ArrayList<Produto> produtos = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    Cliente cliente = new Cliente();
    Produto produto = new Produto();

    public Produtos(){
        produtos.add(new Produto("Arroz", 2.5f, 3));
        produtos.add(new Produto("Feijão", 2.5f, 5));
        produtos.add(new Produto("Café", 2.5f, 7));
        produtos.add(new Produto("Macarrão", 2.5f, 7));
        produtos.add(new Produto("Cuscuz", 2.5f, 7));
        produtos.add(new Produto("Açuca", 2.5f, 87));
        produtos.add(new Produto("Caviar fds", 10.000f, 87));
    }
    
    // Padrão de projeto Singleton pattern
    private static Produtos istance = null;
    static public Produtos getInstance(){
        if (istance == null){
            istance = new Produtos();
        }
        return istance;
    }

    public void adicionarProduto(){
        System.out.println("\n\n==========================================");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Qual sera o valor do produto? ");
        int valor = input.nextInt();
        System.out.print("Tera quantos diponiveis? ");
        int quantidade = input.nextInt();
        produtos.add(new Produto(nome, valor, quantidade));
    }

    public void comprarProduto(ComprarProduto comprarProduto){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);

        if(produto.getNome().toLowerCase().equals(comprarProduto.getNome())){
            if(produto.getQuantidade() > 0){
                // Mandar para tela perguntando qual a forma de pagamento
                cliente.mudarDinheiro(cliente.getDinheiro() - (produto.valor * comprarProduto.pegarQuantidade()));
                produto.mudarQuantidade(produto.getQuantidade() - comprarProduto.pegarQuantidade());
        
                if (produto.getQuantidade() == 0){
                    produtos.remove(produto);
                }else if (produto.getQuantidade() < 0){
                    produtos.remove(produto);
                    System.out.println("Quantidade invalida");
                    }
                }
            // Sai do loop.
            break;
        }}
    }
    public void removerProduto(RemoverProduto removerProduto){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
    
            if(produto.getNome().toLowerCase().equals(removerProduto.getNome())){
                
                produtos.remove(produto);
                // Sai do loop.
                break;
            }
        }
    }
    public void pesquisarProduto(PesquisarProduto pesquisarProduto){
        for (Produto produto: produtos){ //Chamada Enhanced for-loop para percorrer toda a lista.
            if(produto.getNome().toLowerCase().equals(pesquisarProduto.getNome().toLowerCase())){
                System.out.println(produto);
            }
        }
            
    }
    public void VerProdutos(){
        for (Produto produto: produtos){ //Chamada Enhanced for-loop para percorrer toda a lista.
            System.out.println(produto);
        }
    }

}
