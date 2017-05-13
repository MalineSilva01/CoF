package chainOfR;

public class Fill extends FilterOp {
	
	String fill;
	
	public Fill(String fill) {
		super();
		this.fill = fill;
	}


	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("filtro Fill aplicado");

	}

}
