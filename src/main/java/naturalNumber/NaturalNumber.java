package naturalNumber;

public abstract class NaturalNumber {

	private int value;

	public NaturalNumber(int i) {
		this.value = i;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}

	public abstract String getTextValue();

}
