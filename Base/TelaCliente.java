package Base;

import PRODUTO.ComprarProduto;
import PRODUTO.Produtos;

public class TelaCliente extends Base{
    Produtos produto = new Produtos();
    
    @Override
    public void removerComprar() {
        produto.ProdutosCadastrados();
        produto.VerProdutos();
        produto.comprarProduto(new ComprarProduto());   
    }

    @Override
    public void adicionarProduto() {
    }
    @Override
    public void telaCliente() {
    }
    @Override
    public void telaFuncionario() {  
    }
}
    
    

