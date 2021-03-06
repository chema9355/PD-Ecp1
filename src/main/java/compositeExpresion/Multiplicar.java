package compositeExpresion;

public class Multiplicar extends CompositeNode {

	public Multiplicar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {
		return this.getExp1().operar() * this.getExp2().operar();
	}

	@Override
	public String toString() {
		return "(" + this.getExp1().toString() + "*" + this.getExp2().toString() + ")";
	}

}
