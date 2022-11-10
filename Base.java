public abstract class Base {
    public void opcoes(){
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
        System.out.println("Ver Todos os Produtos");
    }
    private void pesquisarProtuto(){
        System.out.println("Pesquisar um Produto");
    }
    private void voltar(){
        System.out.println("Voltar");
    }
    private void sair(){
        System.out.println("SAIR");
    }
}
