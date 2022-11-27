
public abstract class PromocaoDecorator implements Promocao{
	private final Promocao PromocaoDecorador;
	
	public PromocaoDecorator(Promocao promocao) {
		this.PromocaoDecorador = promocao;
	}
	
	@Override
    public double informarPreco() { 
        return PromocaoDecorador.informarPreco();
    }

    @Override
    public String informarOpcoes() {
        return PromocaoDecorador.informarOpcoes();
    }

	public Promocao getPromocao() {
		return PromocaoDecorador;
	}
}
