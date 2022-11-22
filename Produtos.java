import java.util.ArrayList;
public class Produtos {
    ArrayList<Produto> produtos = new ArrayList<>();


    public void ProdutosCadastrados(){
        produtos.add(new Produto("Arroz", 2.5f, 2));
        produtos.add(new Produto("Feijão", 2.5f, 6));
        produtos.add(new Produto("Café", 2.5f, 10));
        produtos.add(new Produto("Macarrão", 2.5f, 7));
        produtos.add(new Produto("Cuscuz", 2.5f, 11));
        produtos.add(new Produto("Açuca", 2.5f, 8));
        produtos.add(new Produto("Caviar", 1000.0f, 1));
    }
    
    public void CadastrarNovoProduto(Produto produto){
        produtos.add(produto);
    }
        
    public void VerProdutos(){
        for (Produto produto: produtos){ //Chamada Enhanced for-loop para percorrer toda a lista.
            System.out.println(produto);
        }
    }
}
