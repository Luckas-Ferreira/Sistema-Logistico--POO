package TelaCliente;


public abstract class Cliente{  
    //Intenção da classe cliente é registrar os clientes que estão a usar o sistema do mercadinho
    //mostrando a visão de um cliente ao entrar em uma loja, onde tem as informações que por enquanto
    //estou jugando inicialmente como a base dessa classe, onde o cliente tem seu nome, idade e o dinheiro
    //que tem consigo para adquirir os produtos do mercado ou apenas ver os produtos disponiveis.
    
    // Atributos
    protected String nome;
    protected int idade;
    protected double dinheiro;
    
    
    public Cliente(String nome, int idade, double dinheiro) {
        
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }

    public String nomeCliente() {
        return nome;
    }


    public int idadeCliente() {
        return idade;
    }

    public double dinheiroCliente() {
        return dinheiro;
    }



}
