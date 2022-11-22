public class Main {
    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        produtos.ProdutosCadastrados();
        produtos.VerProdutos();
        produtos.comprarProduto(new ComprarProduto("Caviar fds", 10));
        produtos.VerProdutos();
    }
}
