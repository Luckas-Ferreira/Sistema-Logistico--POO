package Base;

import PRODUTO.Produtos;
import PRODUTO.RemoverProduto;

public class TelaFuncionario extends Base{
    Produtos produto = new Produtos();
    
    
    @Override
    public void adicionarProduto() {
        produto.ProdutosCadastrados();
        produto.VerProdutos();
        produto.adicionarProduto(null);
    }

    @Override
    public void removerComprar() {
        produto.ProdutosCadastrados();
        produto.removerProduto(new RemoverProduto("Gato")); 
    }    
}