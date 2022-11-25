package PRODUTO;

import java.util.ArrayList;

public class Produtos{
    ArrayList<Produto> produtos = new ArrayList<>();

    public Produtos(){}
    
    public void ProdutosCadastrados(){
        produtos.add(new Produto("Arroz", 2.5f, 3));
        produtos.add(new Produto("Feijão", 2.5f, 5));
        produtos.add(new Produto("Café", 2.5f, 7));
        produtos.add(new Produto("Macarrão", 2.5f, 7));
        produtos.add(new Produto("Cuscuz", 2.5f, 7));
        produtos.add(new Produto("Açuca", 2.5f, 87));
        produtos.add(new Produto("Caviar fds", 10.000f, 87));
    }
    
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void comprarProduto(ComprarProduto comprarProduto){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);

        if(produto.getNome().equals(comprarProduto.getNome())){
            if(produto.getQuantidade()> 0){
                // Mandar para tela perguntando qual a forma de pagamento
                produto.mudarQuantidade(produto.getQuantidade() - comprarProduto.getQuantidade());
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
    
            if(produto.getNome().equals(removerProduto.getNome())){
                
                produtos.remove(produto);
                // Sai do loop.
                break;
            }
        }
    }
    public void pesquisarProduto(PesquisarProduto pesquisarProduto){
        for(int i = 0; i < produtos.size(); i++){
            Produto produto = produtos.get(i);
    
            if(produto.getNome().equals(pesquisarProduto.getNome())){
                produto.getNome();
            }
        }
            
    }
    public void VerProdutos(){
        for (Produto produto: produtos){ //Chamada Enhanced for-loop para percorrer toda a lista.
            System.out.println(produto);
        }
    }

}
