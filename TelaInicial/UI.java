package TelaInicial;


import Base.TelaFuncionario;
import Base.Iniciar;
import SobreCLiente.CadastroCliente;


public class UI{
    
    TelaFuncionario funcionario = new TelaFuncionario();
    Iniciar iniciar = new Iniciar();
    CadastroCliente cliente = new CadastroCliente();
    

    
    public void telaInicial(){
        System.out.println("\n\n==========================================");
        System.out.println("\tMercadinho do Thiago\n");
        System.out.println("Você é um consumidor ou funcionario?");
        System.out.println("\n\t[1]   Consumidor   [1]");
        System.out.println("\t[2]  Funcionario   [2]");
        System.out.println("\t[3]      SAIR      [3]\n");
        iniciar.opcao();
    }
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
