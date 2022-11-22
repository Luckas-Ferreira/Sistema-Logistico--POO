public class Produto {
    protected String nome;
    protected float valor;

    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    
    @Override
    public String toString() {
        return "Produto: " + nome + ", Valor: " + valor;
    }
}
