public abstract class Base {
    
<<<<<<< HEAD
    protected abstract void adicionarProduto();
    protected abstract void removerAdicionar();
=======
    protected abstract void comprarAdicionar();
    protected abstract void removerProduto();
>>>>>>> 27a62c04edcfe8d366d4c8fa04df494969eead5e

    public void opcoes(){
        System.out.println("\n\n\tTELA DO CLIENTE\n");
        adicionarProduto();
        removerAdicionar();
        verTodosProduto();
        pesquisarProtuto();
        voltar();
        sair();
    }

<<<<<<< HEAD
    protected void verTodosProduto(){
=======
    private void verTodosProduto(){
>>>>>>> 27a62c04edcfe8d366d4c8fa04df494969eead5e
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