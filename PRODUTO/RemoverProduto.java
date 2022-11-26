package PRODUTO;

import java.util.Scanner;

import Base.Color;

public class RemoverProduto {
    Scanner input = new Scanner(System.in);
    protected String nome;
        
    public RemoverProduto(){
        System.out.print(Color.YELLOW + "Nome do produto: " + Color.RESET);
        this.nome = input.nextLine().toLowerCase();
    }

    public String getNome() {
        return nome;
    }
}
