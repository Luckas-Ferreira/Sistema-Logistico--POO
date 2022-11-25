package Base;

import PRODUTO.Produtos;
import PRODUTO.RemoverProduto;


public class TelaFuncionario extends Base{
        
    @Override
    public void adicionarProduto() {
        
        Produtos.getInstance().VerProdutos();
        Produtos.getInstance().adicionarProduto(null);
    }

    @Override
    public void removerComprar() {
        
        Produtos.getInstance().removerProduto(new RemoverProduto("Gato")); 
    }


    @Override
    public void telaCliente() {  
    }
    @Override
    public void telaFuncionario() {    
    }    
}