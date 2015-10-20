package calculadoraMementable;

import calculadora.Comando;

public abstract class ComandoAbstractoMementable implements Comando {

	private CalculadoraMementable calculadora;

	public ComandoAbstractoMementable(CalculadoraMementable calculadora) {
		this.calculadora = calculadora;
	}

	public CalculadoraMementable getCalculadora() {
		return this.calculadora;
	}

}
