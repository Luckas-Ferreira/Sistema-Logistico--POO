package views;

import controllers.InteracaoTelaInicial;


public class TelaInicial {
    
    public void start(){

        System.out.println("\n\n\tMercadinho do Thiago\n");
        System.out.println("Você é um consumidor?");
        System.out.println("Você é um funcionario?");
        System.out.println("\n\t[1]   Consumidor   [1]");
        System.out.println("\t[2]  Funcionario   [2]");
        System.out.println("\t[3]      SAIR      [3]\n");

        InteracaoTelaInicial tela = new InteracaoTelaInicial();
        tela.opcaoTelaInicial();
    }
}
