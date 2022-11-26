package SobreCLiente;

import java.util.Scanner;

import Base.Color;
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
        
        System.out.println("\n============ " + Color.GREEN + "Entrando cliente" + Color.RESET + " ============\n");
        System.out.print(Color.YELLOW + "Nome do cliente: " + Color.RESET);
        this.nome = entrada.nextLine();
        
        this.codigo = (int) (1 + Math.random() * 1000-1);
        
        System.out.print(Color.CYAN + "Dinheiro do cliente: R$" + Color.RESET);
        this.dinheiro = entrada.nextFloat();
        
        // Criar um objeto na classe
        objCliente = new Cliente(this.nome, this.codigo, this.dinheiro);
        

        //Cadastrar no registro do mercadinho
        CadastroCliente.getInstance().adicionarCliente(objCliente);
        
        
        
    }
}
