public abstract class Base {
    
    protected abstract void comprarAdicionar();
    protected abstract void removerProduto();

    public void opcoes(){
        System.out.println("\n\n\tTELA DO CLIENTE\n");
        comprarAdicionar();
        removerProduto();
        verTodosProduto();
        pesquisarProtuto();
        voltar();
        sair();
    }

    protected void verTodosProduto(){
        System.out.println("[ T ] Ver todos os produtos [ T ]");
    }
    protected void pesquisarProtuto(){
        System.out.println("[ P ]  Pesquisar pelo nome  [ P ]");
    }
    protected void voltar(){
        System.out.println("[ V ] Voltar../ Tela Inicial[ V ]");
    }
    protected void sair(){
        System.out.println("[ S ]        SAIR           [ S ]\n");
    }
}
