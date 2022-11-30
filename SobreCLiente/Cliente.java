package SobreCLiente;


public class Cliente{
    // Atributos
    private String nome;
    private int codigo;
    private float dinheiro;
    private float gasto;

    // Construtor Default
    public Cliente(){ }

    // Construtor com sobrecarga
    public Cliente(String nome, int codigo, float dinheiro) {
        this.nome = nome;
        this.codigo = codigo;
        this.dinheiro = dinheiro;
        this.gasto = 0;
    }

    // Metodos de acesso
    public String valorNome() {
        return nome;
    }
    public void mostrarNome(String nome) {
        this.nome = nome;
    }
    public int mostrarCodigo() {
        return codigo;
    }
    public void alterarCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float mostrarDinheiro() {
        return dinheiro;
    }
    public void alterarDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float valorGasto() {
        return gasto;
    }

    public void alterarGasto(float gasto) {
        this.gasto = gasto;
    }

    // Método de impressão do cliente
    public String imprimir(){
        return "Nome cliente: "+ this.nome+"\nCodigo cliente: "+this.codigo+
                String.format("\nGasto: R$%.2f \n", this.gasto);
    }


}
