package PRODUTO;

import java.util.Scanner;

public class PesquisarProduto{
    Scanner input = new Scanner(System.in);
    protected String nome;

    public PesquisarProduto(){
        System.out.print("Nome do produto: ");
        this.nome = input.nextLine().toLowerCase();
    }

    public String mostrarNomeP() {
        return nome;
    }

}
