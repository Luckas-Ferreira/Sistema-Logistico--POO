package controllers;

import java.util.Scanner;

import views.TelaFuncionario;
import views.TelaInicial;

public class InteraçãoTelaFuncionario extends TelaFuncionario{
    public void opcaoFuncionario(){
        Scanner input = new Scanner(System.in);
        while(true){

            System.out.print("Escolha o que deseja: ");
            String decisao = input.next().toUpperCase();
            
            if (decisao.equals("A")){
                adicionarProduto();
                // Rediriceso para tela de comprar item
            } else if (decisao.equals("R")){
                removerAdicionar();
            } else if (decisao.equals("T")){
                verTodosProduto();
            } else if (decisao.equals("P")){
                pesquisarProtuto();
            } else if (decisao.equals("V")){
                TelaInicial tela = new TelaInicial();
                tela.start();
            } else if (decisao.equals("S")){
                sair();
                break;
            }

        }
        input.close();
    }
}
