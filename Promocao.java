import java.util.Scanner;

public class Promocao {
    public void opcaoPromocao(){
        Scanner input = new Scanner(System.in);

        Boolean condicao = true;
        while(condicao){
            System.out.println("\n==========================================\n");
            System.out.print("Escolha o que deseja: ");
            String decisao = input.nextLine().toUpperCase();
            System.out.println("\n==========================================\n");
            if (decisao.equals("1")){
                CocaCola c = new CocaCola();
		        c = new Oreo(c);
		        imprimirInfo(c);
                
            }else if(decisao.equals("3")){
                
                break;
            }
        }
        
    }
}
