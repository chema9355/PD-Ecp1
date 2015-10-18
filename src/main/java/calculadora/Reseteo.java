package calculadora;

public class Reseteo extends ComandoAbstracto {

	public Reseteo(Calculator calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		this.getCalculadora().reset();
	}

	@Override
	public String name() {
		return "Reseteo";
	}

}
