package chainOfR;

public class Main {

	public static void main(String[] args) {

		FabricaDeFiltros fabrica = new FabricaDeFiltros();

		FilterOp filtro = fabrica.gotham();

		Imagem i = new Imagem();

		try {
			filtro.apply(i);
		} catch (FilterError e) {
			e.printStackTrace();
		}
	}

}
