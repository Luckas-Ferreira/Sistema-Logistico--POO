package TelaInicial;

import Base.TelaCliente;
import Base.TelaFuncionario;

public class UI{
    TelaCliente cliente = new TelaCliente();
    TelaFuncionario funcionario = new TelaFuncionario();
    
    public void telaCliente(){
        System.out.println("\n\n\tTELA DO CLIENTE\n");
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        System.out.println("[ T ] Ver todos os produtos [ T ]");
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
        System.out.println("[ S ]        SAIR           [ S ]\n");
        cliente.opcao();
    }

    public void telaFuncionario(){
        System.out.println("\n\n\tTELA DO FUNCIONARIO\n");
        System.out.println("[ A ] Adicionar um produto  [ A ]");
        System.out.println("[ R ]  Remover um produto   [ R ]");
        System.out.println("[ T ] Ver todos os produtos [ T ]");
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
        System.out.println("[ S ]        SAIR           [ S ]\n");
        funcionario.opcao();
    }
}
