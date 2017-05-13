package chainOfR;

public class Colorize extends FilterOp {
	
	int colorize;
	
	
	public Colorize(int colorize) {
		super();
		this.colorize = colorize;
	}


	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("filtro Colorize aplicado");

	}

}
