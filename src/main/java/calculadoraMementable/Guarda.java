package calculadoraMementable;

import upm.jbb.IO;

public class Guarda extends ComandoAbstractoMementable {

	public Guarda(CalculadoraMementable calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		this.getCalculadora().getGm().addMemento(IO.getIO().readString("Nombre del Memento"),
				this.getCalculadora().getO().createMemento(this.getCalculadora().getTotal()));
	}

	@Override
	public String name() {
		return "Guarda";
	}

}
