public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.ProdutosCadastrados();
        produto.removerProduto(new RemoverProduto("Macarrão"));
        produto.VerProdutos();
    }
}
