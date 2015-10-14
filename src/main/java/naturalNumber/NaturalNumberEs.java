package naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

	private static final String[] textValueEsp = { "cero", "uno", "dos", "tres", "cuatro", "cinco" };

	public NaturalNumberEs(int i) {
		super(i);
	}

	public String getTextValue() {
		if (this.getValue() < textValueEsp.length) {
			return NaturalNumberEs.textValueEsp[this.getValue()];
		} else {
			return "???";
		}
	}

}
