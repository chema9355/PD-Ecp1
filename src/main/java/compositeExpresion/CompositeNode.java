package compositeExpresion;

public abstract class CompositeNode extends Expresion {

	private Expresion expresion1;
	private Expresion expresion2;

	public CompositeNode(Expresion exp1, Expresion exp2) {
		this.expresion1 = exp1;
		this.expresion2 = exp2;
	}

	public Expresion getExp1() {
		return this.expresion1;
	}

	public Expresion getExp2() {
		return this.expresion2;
	}

}
