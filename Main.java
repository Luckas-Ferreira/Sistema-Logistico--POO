public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        produto.ProdutosCadastrados();
        produto.CadastrarNovoProduto(new Produto("Bosta", 10f, 222));
        produto.VerProdutos();
    }
}
