package naturalNumber;

public class LanguajeManager {

	private NaturalNumber languaje;
	private LanguajeCreator creator;

	public void setCreator(LanguajeCreator creator) {
		this.creator = creator;
	}

	public void createLanguaje() {
		this.languaje = this.creator.createLanguaje();
	}

	public NaturalNumber getNumber() {
		return languaje;
	}
	
	public static void main (String [ ] args) {
		 LanguajeManager a = new LanguajeManager();
		 a.setCreator(new FrenchCreator());
		 a.createLanguaje();
		 System.out.print(a.languaje.getTextValue());
        //Aquí las instrucciones del método

	}

}
