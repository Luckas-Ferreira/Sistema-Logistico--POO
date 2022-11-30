package PRODUTO;

public class Produto {

    protected String nome;
    protected float valor;
    protected int quantidade;
    
    public Produto(){}

    public Produto(String nome, float valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    

    public String mostrarNome() {
        return nome;
    }


    public float mostrarValor() {
        return valor;
    }

    public int mostrarQuantidade(){
        return quantidade;
    }
    public void alterarQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + String.format(", valor: R$%.2f", valor) + ", quantidade: " + quantidade;
    }
}
