package chainOfR;

public class Modulate extends FilterOp {

	int i; int j; int k;
	
	public Modulate(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}


	@Override
	public void op(Imagem i) throws FilterError {
		System.out.println("filtro Modulate aplicado");

	}

}
