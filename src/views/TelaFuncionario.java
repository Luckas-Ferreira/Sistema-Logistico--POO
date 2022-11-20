package views;

import models.Base;

public class TelaFuncionario extends Base{
    
    public TelaFuncionario(){
        System.out.println("\n\n\tTELA DO FUNCIONARIO\n");
    }
    
    @Override
    protected void adicionarProduto() {
        
        System.out.println("[ A ] Adicionar um produto  [ A ]");
        
    }

    @Override
    protected void removerAdicionar() {
        System.out.println("[ R ]  Remover um produto   [ R ]");
        
    }
}