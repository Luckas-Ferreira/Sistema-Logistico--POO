package PRODUTO;

import java.util.Scanner;

import Base.Color;

public class ComprarProduto {
    Scanner input = new Scanner(System.in);
    protected String nome;
    protected int quantidade;
    
    public ComprarProduto(){
        System.out.print(Color.YELLOW + "Nome do produto: " + Color.RESET);
        this.nome = input.nextLine().toLowerCase();
        System.out.print(Color.CYAN + "Deseja comprar quantos desse produto? " + Color.RESET);
        this.quantidade = input.nextInt();
    }

    public String getNome() {
        return nome;
    }
    public int pegarQuantidade(){
        return quantidade;
    }
}
