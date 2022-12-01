package SobreCLiente;

import java.util.Scanner;


public class ViewCadastroCliente{
    // Atributos
    private String nome;
    private int codigo; 
    private float dinheiro;
    

    // Referencia para classe Cliente
    private Cliente objCliente;

    public void cadastroCliente(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n============ Entrando cliente ============\n");
        System.out.print("Nome do cliente: ");
        this.nome = entrada.nextLine();
        
        this.codigo = (int) (1 + Math.random() * 1000-1);
        
        System.out.print("Dinheiro do cliente: R$");
        this.dinheiro = entrada.nextFloat();
        
        // Criar um objeto na classe
        objCliente = new Cliente(this.nome, this.codigo, this.dinheiro);
        

        //Cadastrar no registro do mercadinho
        CadastroCliente.getInstance().adicionarCliente(objCliente);
        
        
        
    }
}
