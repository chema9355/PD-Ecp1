package compositeExpresion;

public class Numero extends Expresion{

	private int num;
	
	@Override
	public int operar() {
		return this.num;
	}

}
