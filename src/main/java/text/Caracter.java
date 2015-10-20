package text;

public class Caracter extends Componente {

	private char c;

	public Caracter(char key) {
		this.c = key;
	}

	@Override
	public String dibujar(boolean b) {
		if (b) {
			return String.valueOf(c).toUpperCase();
		} else
			return String.valueOf(c);
	}

	@Override
	public void add(Componente componente) {
	}

	@Override
	public void remove(Componente componente) {

	}

	@Override
	public boolean isEscrito() {
		return false;
	}
	
	
}
