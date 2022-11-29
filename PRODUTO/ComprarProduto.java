package PRODUTO;

import java.util.Scanner;

public class ComprarProduto {
    Scanner input = new Scanner(System.in);
    protected String nome;
    protected int quantidade;
    
    public ComprarProduto(){
        System.out.print("Nome do produto: ");
        this.nome = input.nextLine().toLowerCase();
        System.out.print("Deseja comprar quantos desse produto? ");
        this.quantidade = input.nextInt();
    }

    public String mostrarNome() {
        return nome;
    }
    public int mostrarQuantidade(){
        return quantidade;
    }
}
