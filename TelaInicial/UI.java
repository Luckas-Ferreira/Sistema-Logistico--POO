package TelaInicial;


import Base.TelaFuncionario;
import Base.Iniciar;
import Base.TelaCliente;
import SobreCLiente.CadastroCliente;


public class UI{
    
    private TelaFuncionario funcionario = new TelaFuncionario();
    private Iniciar iniciar = new Iniciar();
    private TelaCliente cliente = new TelaCliente();
    

    
    public void telaInicial(){
        System.out.println("\n\n==========================================");
        System.out.println("\t  Mercadinho do Thiago\n");
        System.out.println("   Você é um consumidor ou funcionario?");
        System.out.println("\n\t[1]   Consumidor   [1]");
        System.out.println("\t[2]  Funcionario   [2]");
        System.out.println("\t[3]      SAIR      [3]\n");
        iniciar.opcao();
    }
    public void telaCliente(){
        CadastroCliente.getInstance().cadastroCliente();
        System.out.println("\n\n==========================================\n");
        System.out.println("\t     TELA DO CLIENTE\n");
        System.out.println("    [ C ]    Comprar Produto     [ C ]");
        System.out.println("    [ T ] Ver todos os produtos  [ T ]");
        System.out.println("    [ P ]  Pesquisar pelo nome   [ P ]");
        System.out.println("    [ V ] Voltar../ Tela Inicial [ V ]");
        System.out.println("    [ 3 ]        SAIR            [ 3 ]\n");
        cliente.opcao();
        

    }

    public void telaFuncionario(){
        System.out.println("\n\n==========================================\n");
        System.out.println("\t  TELA DO FUNCIONARIO\n");
        System.out.println("    [ A ] Adicionar um produto   [ A ]");
        System.out.println("    [ R ]  Remover um produto    [ R ]");
        System.out.println("    [ T ] Ver todos os produtos  [ T ]");
        System.out.println("    [ P ]  Pesquisar pelo nome   [ P ]");
        System.out.println("    [ M ] Mostrar status cliente [ M ]");
        System.out.println("    [ V ] Voltar../ Tela Inicial [ V ]");
        System.out.println("    [ 3 ]        SAIR            [ 3 ]\n");
        funcionario.opcao();       
    }
}
