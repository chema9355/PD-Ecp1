package calculadora;

import upm.jbb.IO;

public class Suma extends ComandoAbstracto {

	public Suma(Calculator calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		int i = IO.getIO().readInt();
		this.getCalculadora().add(i);

	}

	@Override
	public String name() {
		return "Suma";
	}

}
