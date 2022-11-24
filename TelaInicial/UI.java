package TelaInicial;


import Base.TelaFuncionario;
import SobreCLiente.CadastroCliente;


public class UI{
    CadastroCliente cliente = new CadastroCliente();
    TelaFuncionario funcionario = new TelaFuncionario();
    
    public void telaCliente(){
        cliente.cadastroCliente();
        System.out.println("\n\n==========================================\n");
        System.out.println("\tTELA DO CLIENTE\n");
        System.out.println("[ C ]    Comprar Produto    [ C ]");
        System.out.println("[ T ] Ver todos os produtos [ T ]");
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
        System.out.println("[ S ]        SAIR           [ S ]\n");
        cliente.opcao();
    }

    public void telaFuncionario(){
        System.out.println("\n\n==========================================\n");
        System.out.println("\tTELA DO FUNCIONARIO\n");
        System.out.println("[ A ] Adicionar um produto  [ A ]");
        System.out.println("[ R ]  Remover um produto   [ R ]");
        System.out.println("[ T ] Ver todos os produtos [ T ]");
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
        System.out.println("[ S ]        SAIR           [ S ]\n");
        funcionario.opcao();
        
    }
}
