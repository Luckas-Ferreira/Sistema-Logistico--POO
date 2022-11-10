public abstract class Base {
    public void opcoes(){
        System.out.println("\n\n\tTELA DO FUNCIONARIO\n");
        adicionarProduto();
        removerProduto();
        comprarProduto();
        verTodosProduto();
        pesquisarProtuto();
        voltar();
        sair();
    }
    
    protected abstract void adicionarProduto();
    protected abstract void removerProduto();
    protected abstract void comprarProduto();
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
