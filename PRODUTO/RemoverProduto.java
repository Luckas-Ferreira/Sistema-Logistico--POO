package PRODUTO;

import java.util.Scanner;

public class RemoverProduto {
    Scanner input = new Scanner(System.in);
    protected String nome;
        
    public RemoverProduto(){
        System.out.print("Nome do produto: ");
        this.nome = input.nextLine().toLowerCase();
    }

    public String mostrarNomeR() {
        return nome;
    }
}
