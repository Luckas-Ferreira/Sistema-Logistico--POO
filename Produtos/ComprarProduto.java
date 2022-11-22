public class ComprarProduto {
    protected String nome;
    protected int quantidade;
    
    public ComprarProduto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
