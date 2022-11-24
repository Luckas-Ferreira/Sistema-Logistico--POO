package SobreCLiente;

import java.util.Scanner;

import Base.TelaCliente;

public class ViewCadastroCliente extends TelaCliente{
    // Atributos
    private String nome;
    private int codigo; 
    private float dinheiro;
    

    // Referencia para classe Cliente
    private Cliente objCliente;

    public void cadastroCliente(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("==== Entrando cliente ====\n");
        System.out.print("Nome do cliente: ");
        this.nome = entrada.nextLine();
        
        this.codigo = (int) (1 + Math.random() * 100-1);
        
        System.out.print("Dinheiro cliente: ");
        this.dinheiro = entrada.nextFloat();
        
        // Criar um objeto na classe
        objCliente = new Cliente(this.nome, this.codigo, this.dinheiro);
        

        //Cadastrar no registro do mercadinho
        CadastroCliente.adicionarCliente(objCliente);
        
        
        
    }
}
