package SobreCLiente;


public class Cliente extends CadastroCliente{
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    // Método de impressão do cliente
    public String imprimir(){
        return "Nome cliente: "+ this.nome+"\nCodigo cliente: "+this.codigo+
                String.format("\nGasto: R$%.2f \n", this.gasto);
    }


}
