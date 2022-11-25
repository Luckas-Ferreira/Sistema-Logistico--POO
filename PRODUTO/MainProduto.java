package PRODUTO;

public class MainProduto {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.VerProdutos();
        produto.comprarProduto(new ComprarProduto());
        produto.VerProdutos();
    }
}
