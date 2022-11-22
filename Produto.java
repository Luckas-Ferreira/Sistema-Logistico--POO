public class Produto {
    protected String nome;
    protected float valor;
    protected int quantidade;

    public Produto(String nome, float valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    
    @Override
    public String toString() {
        return "Produto: " + nome + ", Valor: " + valor + ", Quantiade Disponivel: " + quantidade;
    }
}
