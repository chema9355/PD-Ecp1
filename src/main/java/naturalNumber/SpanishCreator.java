package naturalNumber;

public class SpanishCreator extends LanguajeCreator {

	@Override
	public NaturalNumber createLanguaje() {
		return new NaturalNumberEs(0);
	}

}
