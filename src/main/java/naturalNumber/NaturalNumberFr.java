package naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

	private static final String[] textValueFr = { "zero", "un", "deux", "trois", "quatre", "cinq" };

	public NaturalNumberFr(int i) {
		super(i);
	}

	public String getTextValue() {
		if (this.getValue() < textValueFr.length) {
			return NaturalNumberFr.textValueFr[this.getValue()];
		} else {
			return "???";
		}
	}

}
