package naturalNumber;

public class FrenchCreator extends LanguajeCreator {

	@Override
	public NaturalNumber createLanguaje() {
		return new NaturalNumberFr(0);
	}

}
