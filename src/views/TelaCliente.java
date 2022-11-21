package views;

import models.Base;

public abstract class TelaCliente extends Base{  
    //Intenção da classe cliente é registrar os clientes que estão a usar o sistema do mercadinho
    //mostrando a visão de um cliente ao entrar em uma loja, onde tem as informações que por enquanto
    //estou jugando inicialmente como a base dessa classe, onde o cliente tem seu nome, idade e o dinheiro
    //que tem consigo para adquirir os produtos do mercado ou apenas ver os produtos disponiveis.
    
    
    
    public TelaCliente() {
        System.out.println("\n\n\tTELA DO CLIENTE\n");
        
    }
    @Override
    protected void adicionarProduto() {
        System.out.println("[ C ]    Comprar Produto    [ C ]");
    }

    @Override
    protected void removerAdicionar() {
    }



}
