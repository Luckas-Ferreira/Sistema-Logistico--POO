package SobreCLiente;

import java.util.ArrayList;


public class CadastroCliente extends ViewCadastroCliente{
    
    // Lista de registro de clientes
    static private ArrayList<Cliente> listaClientes = new ArrayList<>();

    static public void adicionarCliente(Cliente c){
        listaClientes.add(c);
    }

    // Mostra todos clientes registrados
    static public String listarClientes(){
        String saida = "";
        int i = 1;
        for(Cliente l : listaClientes){
            saida += "\n======= Cliente Nº " + (i++)+" =======\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }

    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    
}
