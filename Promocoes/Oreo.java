public class Oreo extends PromocaoDecorator{

    public Oreo(Promocao promocao) {
        super(promocao);
        //TODO Auto-generated constructor stub
    }
    @Override
    public double informarPreco() { 
        return super.informarPreco() + 0.5;
    }

    @Override
    public String informarOpcoes() {
        return super.informarOpcoes() + "+ Biscoito Oreo";
    }
}
