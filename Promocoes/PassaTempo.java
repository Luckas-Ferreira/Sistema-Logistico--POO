
public class PassaTempo extends PromocaoDecorator {

	public PassaTempo(Promocao biscoito) {
		super(biscoito);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public double informarPreco() { 
        return super.informarPreco() + 0.5;
    }

    @Override
    public String informarOpcoes() {
        return super.informarOpcoes() + "+ Biscoito Passa Tempo";
    }
}
