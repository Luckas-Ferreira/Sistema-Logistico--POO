
public class Bis extends PromocaoDecorator {
	public Bis(Promocao biscoito) {
		super(biscoito);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public double informarPreco() { 
        return super.informarPreco() + 5.0;
    }

    @Override
    public String informarOpcoes() {
        return super.informarOpcoes() + "+ Biscoito Bis";
    }
}
