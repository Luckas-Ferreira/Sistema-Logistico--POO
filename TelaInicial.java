import java.util.Scanner;

public class TelaInicial {
    
    public void telaInial(){
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        
        System.out.println("\n\n\tMercadinho do Thiago\n");
        System.out.println("Você é um consumidor ou é funcionario do mercadinho?");
        System.out.println("[1]   Consumidor   [1]");
        System.out.println("[2]  Funcionario   [2]");
        System.out.println("[3]      SAIR      [3]");
    
    }
}
