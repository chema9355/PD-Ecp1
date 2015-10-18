package calculadora;

public class Total extends ComandoAbstracto {

	public Total(Calculator calculadora) {
		super(calculadora);
	}

	@Override
	public void execute() {
		System.out.println(this.getCalculadora().getTotal());
	}

	@Override
	public String name() {
		return "Total";
	}

}
