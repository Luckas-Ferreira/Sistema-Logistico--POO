
public class Main {
	public static void imprimirInfo(Promocao c) {
		System.out.println("Preço: " + c.informarPreco() + ", Opções: " + c.informarOpcoes());
	}
	
	public static void main(String[] args) {
		UI ui = new UI();
		ui.bebidas();
		
		Promocao c = new CocaCola();
		imprimirInfo(c);
		ui.biscoito();
		Promocao a = new Fanta();
		
		c = new PassaTempo(c);
		imprimirInfo(c);
		
		c = new CocaCola();
		c = new Bis(a);
		imprimirInfo(c);
		imprimirInfo(a);
	}

}
