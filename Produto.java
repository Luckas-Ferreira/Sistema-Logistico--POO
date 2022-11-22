public class Produto {
    protected String nome;
    protected float valor;
    
    public Produto(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }


    public float getValor() {
        return valor;
    }

}
