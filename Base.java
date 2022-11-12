public abstract class Base {
    public void opcoes(){
        System.out.println("\n\n\tTELA DO FUNCIONARIO\n");
        comprarAdicionar();
        removerProduto();
        verTodosProduto();
        pesquisarProtuto();
        voltar();
        sair();
    }
    
    protected abstract void comprarAdicionar();
    protected abstract void removerProduto();
    private void verTodosProduto(){
        System.out.println("[ T ] Ver todos os produtos [ T ]");
    }
    private void pesquisarProtuto(){
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
    }
    private void voltar(){
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
    }
    private void sair(){
        System.out.println("[ S ]        SAIR           [ S ]\n");
    }
}
