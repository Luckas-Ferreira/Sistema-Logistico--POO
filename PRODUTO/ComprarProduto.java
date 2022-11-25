package PRODUTO;

import java.util.Scanner;

public class ComprarProduto {
    Scanner input = new Scanner(System.in);
    protected String nome;
    protected int quantidade;
    
    public ComprarProduto(){
        System.out.println("Nome do produto: ");
        this.nome = input.nextLine();
        System.out.println("Deseja comprar quantos desse produto? ");
        this.quantidade = input.nextInt();
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
