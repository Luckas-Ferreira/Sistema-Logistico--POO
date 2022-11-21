package controllers;

public class Cliente {
    // Atributos
    protected String nome;
    protected Integer idade;
    protected Double dinheiro;


    public Cliente(String nome, Integer idade, Double dinheiro) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getIdade() {
        return idade;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public Double getDinheiro() {
        return dinheiro;
    }


    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    
    
}
