import java.util.Scanner;

public class TelaInicial {
    
    public void telaInial(){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\n\tMercadinho do Thiago\n");
            System.out.println("    Você é um consumidor ou é funcionario do mercadinho?");
            System.out.println("[1]   Consumidor   [1]");
            System.out.println("[2]  Funcionario   [2]");
            System.out.println("[3]      SAIR      [3]\n");

            System.out.print("Resposta: ");
            int resposta = input.nextInt();

            if (resposta == 1){
                System.out.println("Redirecionando para tela do consumidor");
            } else if(resposta == 2){
                System.out.println("Redirecionando para tela do funcionario");
            }else if(resposta == 3){
                System.out.println("Saindo da tela do mercadinho");
            }
        }
    }
}
