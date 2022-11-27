import java.util.Scanner;


public abstract class Base{
    
    public abstract void adicionarProduto();
    public abstract void removerComprar();
    public abstract void telaCliente();
    public abstract void telaFuncionario();
    

    public void sair(){
        System.out.println("\nDeseja sair do programa? \nDigite [3] novamente para sair!");
        
    }
    
    
    
}

