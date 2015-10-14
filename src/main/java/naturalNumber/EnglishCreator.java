package naturalNumber;

public class EnglishCreator extends LanguajeCreator {

	@Override
	public NaturalNumber createLanguaje() {
		return new NaturalNumberEn(0);
	}

}
