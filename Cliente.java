public class Cliente extends Base{  
    //Intenção da classe cliente é registrar os clientes que estão a usar o sistema do mercadinho
    //mostrando a visão de um cliente ao entrar em uma loja, onde tem as informações que por enquanto
    //estou jugando inicialmente como a base dessa classe, onde o cliente tem seu nome, idade e o dinheiro
    //que tem consigo para adquirir os produtos do mercado ou apenas ver os produtos disponiveis.
    
    // Atributos
    private String nome;
    private int idade;
    private double dinheiro;
    
    
    public Cliente(String nome, int idade, double dinheiro) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }


    @Override
    protected void adicionarProduto() {
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        
    }
    


    @Override
    protected void removerAdicionar() {
        
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getDinheiro() {
        return dinheiro;
    }


    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    


}
