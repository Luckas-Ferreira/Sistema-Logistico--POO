
public class Main {
	public static void imprimirInfo(Promocao c) {
		System.out.println("Preço: " + c.informarPreco() + ", Opções: " + c.informarOpcoes());
	}
	
	public static void main(String[] args) {
		
		Promocao c = new CocaCola();
		c = new Bis(c);
		imprimirInfo(c);
		
		
		
		
		
	}

}
