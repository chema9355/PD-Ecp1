package compositeExpresion;

public class Numero extends Expresion{

	private int num;
	
	public Numero(int num){
	this.num=num;
	}
	
	@Override
	public int operar() {
		return this.num;
	}

	@Override
	public String toString() {
		return "" + this.num;
	}

}
