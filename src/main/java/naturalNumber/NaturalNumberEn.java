package naturalNumber;

public class NaturalNumberEn extends NaturalNumber {

	private static final String[] textValueEn = { "cero", "one", "two", "three", "four", "five" };

	public NaturalNumberEn(int i) {
		super(i);
	}

	public String getTextValue() {
		if (this.getValue() < textValueEn.length) {
			return NaturalNumberEn.textValueEn[this.getValue()];
		} else {
			return "???";
		}
	}

}
