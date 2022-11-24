package PRODUTO;

public class Produto {
    protected String nome;
    protected float valor;
    protected int quantidade;
    
    public Produto(String nome, float valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }


    public float getValor() {
        return valor;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void mudarQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", valor: " + valor + ", quantidade: " + quantidade;
    }
}
