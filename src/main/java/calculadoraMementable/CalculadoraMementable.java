package calculadoraMementable;

import calculadora.Calculator;

public class CalculadoraMementable extends Calculator {

	private GestorMementos<MementoCalculadora> gm;
	private Mementable<MementoCalculadora> o;

	public CalculadoraMementable(GestorMementos<MementoCalculadora> gm, Originador o) {
		super();
		this.gm = gm;
		this.o = o;
	}

	public GestorMementos<MementoCalculadora> getGm() {
		return gm;
	}

	public void setGm(GestorMementos<MementoCalculadora> gm) {
		this.gm = gm;
	}

	public Mementable<MementoCalculadora> getO() {
		return o;
	}

	public void setO(Mementable<MementoCalculadora> o) {
		this.o = o;
	}

	public GestorMementos<MementoCalculadora> gestorMementos() {
		return this.gm;
	}

}
