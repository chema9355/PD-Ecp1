package calculadoraMementable;

import upm.jbb.IO;

public class Deshace extends ComandoAbstractoMementable {

	public Deshace(CalculadoraMementable calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		this.getCalculadora().setTotal(this.getCalculadora().getGm()
				.getMemento((String) IO.getIO().select(this.getCalculadora().getGm().keys(), "Restaurar")).getValor());
	}

	@Override
	public String name() {
		return "Deshace";
	}

}
