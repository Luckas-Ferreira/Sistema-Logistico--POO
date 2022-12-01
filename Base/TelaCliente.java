package Base;

import PRODUTO.ComprarProduto;
import PRODUTO.Produtos;


public class TelaCliente extends Base{
    @Override
    public void removerComprar() {
        Produtos.getInstance().comprarProduto(new ComprarProduto());  
    }

    @Override
    public void adicionarProduto() {
    }
}
    
    

