public class Produto {
    protected String nome;
    protected float valor;

    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", valor:" + valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
