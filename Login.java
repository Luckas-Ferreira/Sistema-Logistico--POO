import java.util.Scanner;

public class Login implements Autenticador{
    Scanner resposta = new Scanner(System.in);
    
    public void verificar(Funcionario funcionario){
        verificar();
    }
    
    @Override
    public void verificar() {
        Verificador v = new Verificador();
        v.fazerLogin();
        
    }
}


/*
 * Scanner resposta = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        public void adicionarLogin(Funcionario funcionario){
            listaFuncionario.add(funcionario);
    

            public void fazerLogin(){
                for (Funcionario funcionario : listaFuncionario){
                    if (funcionario.getUsuario().equals(this.usuario) && funcionario.getSenha().equals(this.senha)){
                        System.out.println("Entrando no sistema");
                        //Mandar para a tela funcionario
                    }else {
                        Scanner resposta = new Scanner(System.in);
                        String resp = "";
                        System.out.println("Login Invalido");
                        while (!resp.equals("S")){
                            System.out.print("Deseja cadastrar um novo usuário? [S/N]: ");
                            resp = resposta.next().toUpperCase();
                            if (resp.equals("S")){
                                System.out.print("Novo Usuário: ");
                                String usuario2 = resposta.next();
                                System.out.print("Nova Senha: ");
                                String senha2 = resposta.next();
                                System.out.println("Novo login cadastrado!");
                                System.out.print("Usuário: ");
                                String novo_user = resposta.next();
                                System.out.print("Senha: ");
                                String nova_password = resposta.next();
                                if (funcionario.getUsuario().equals(novo_user) && funcionario.getSenha().equals(nova_password) || usuario2.equals(novo_user) && senha2.equals(nova_password)){
                                    System.out.println("Entrando no sistema");
                                    //Mandar para a tela funcionario
                                }
                                else{
                                    System.out.println("Login Invalido!");
                                    //Mandar para a tela inicial
                                }
                            
                            }
 */