package SobreCLiente;

import java.util.ArrayList;


public class CadastroCliente extends ViewCadastroCliente{
    
    // Lista de registro de clientes
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    private int index = -1;

    


    // Padrão de projeto Singleton pattern
    private static CadastroCliente istance = null;
    static public CadastroCliente getInstance(){
        if (istance == null){
            istance = new CadastroCliente();
        }
        return istance;
    }

    public void adicionarCliente(Cliente c){
        listaClientes.add(c);
        index++;
    }

    // Mostra todos clientes registrados
    public String listarClientes(){
        String saida = "";
        int i = 1;
        for(Cliente l : listaClientes){
            saida += "\n======= Cliente Nº " + (i++)+" =======\n";
            saida += l.imprimir() + "\n";
        }
        return saida;
    }

    public String gastoTotal(){
        double gastoTotal = 0;
        String saidaGasto = "";
        for (int c = 0; c<listaClientes.size(); c++){
            gastoTotal += listaClientes.get(c).getGasto();
        }
        saidaGasto = "\n------------------------------------------\nTotal de compras realizadas: R$"+ gastoTotal;
        return saidaGasto;
    }

    public String serCliente(){
        String saida = "";
        int i = index + 1;
        saida += "\n======= Cliente Nº " + (i++)+" =======\n";
        saida += listaClientes.get(index).imprimir() + "\n";
        
        return saida;
    }

    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public int getIndex() {
        return index;
    }
}
