package calculadora;

import upm.jbb.IO;

public class Resta extends ComandoAbstracto{

	public Resta(Calculator calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		int i = IO.getIO().readInt();
		this.getCalculadora().subtract(i);
	}

	@Override
	public String name() {
		return "Resta";
	}

}
