package TelaInicial;


import Base.TelaFuncionario;
import Base.Iniciar;
import SobreCLiente.CadastroCliente;
import Base.Color;


public class UI{
    
    TelaFuncionario funcionario = new TelaFuncionario();
    Iniciar iniciar = new Iniciar();
    CadastroCliente cliente = new CadastroCliente();
    

    
    public void telaInicial(){
        System.out.println("\n\n==========================================");
        System.out.println(Color.GREEN + "\t   Mercadinho do Thiago\n" + Color.RESET);
        System.out.println(Color.RED + "  Você é um consumidor ou funcionario?" + Color.RESET);
        System.out.println("\n\t[1]   Consumidor   [1]");
        System.out.println("\t[2]  Funcionario   [2]");
        System.out.println("\t[3]      SAIR      [3]\n");
        iniciar.opcao();
    }
    public void telaCliente(){
        cliente.cadastroCliente();
        System.out.println("\n\n==========================================\n");
        System.out.println(Color.GREEN + "\t     TELA DO CLIENTE\n" + Color.RESET);
        System.out.println("    [ C ]    Comprar Produto    [ C ]");
        System.out.println("    [ T ] Ver todos os produtos [ T ]");
        System.out.println("    [ P ]  Pesquisar pelo nome  [ P ]");
        System.out.println("    [ V ] Voltar../ Tela Inicial[ V ]");
        System.out.println("    [ 3 ]        "+ Color.RED + "SAIR" +  Color.RESET + "           [ 3 ]\n");
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
        System.out.println("[ 3 ]        SAIR           [ 3 ]\n");
        funcionario.opcao();
        
    }
}
