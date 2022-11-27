
public class Main {
	public static void imprimirInfo(Promocao c) {
		System.out.println("Preço: " + c.informarPreco() + ", Opções: " + c.informarOpcoes());
	}
	
	public static void main(String[] args) {
		Promocao c = new CocaCola();
		imprimirInfo(c);
		Promocao a = new Fanta();
		
		c = new PassaTempo(c);
		imprimirInfo(c);
		
		c = new CocaCola();
		c = new Bis(a);
		imprimirInfo(c);
		imprimirInfo(a);
	}

}
