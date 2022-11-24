package PRODUTO;

public class Main {
    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        
        produtos.ProdutosCadastrados();
        produtos.VerProdutos();
        System.out.println("--");
        produtos.removerProduto(new RemoverProduto("Açuca"));
        produtos.VerProdutos();
        System.out.println("--");
        produtos.comprarProduto(new ComprarProduto("Cuscuz", 6));
        produtos.VerProdutos();
        System.out.println("-=-=-=--=-===-");
        produtos.pesquisarProduto(new PesquisarProduto("Café"));
    }
}
