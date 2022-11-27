
public class Bis extends PromocaoDecorator {
	public Bis(Promocao c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

    @Override
    public double informarPreco() { 
        return super.informarPreco() + 0.5;
    }

    @Override
    public String informarOpcoes() {
        return super.informarOpcoes() + "+ Biscoito Bis";
    }
}
