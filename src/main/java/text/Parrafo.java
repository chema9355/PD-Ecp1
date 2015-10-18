package text;

public class Parrafo extends Escrito {

	public Parrafo() {
		super();
	}

	@Override
	public String dibujar(boolean b) {
		String resultado = "";
		if (b) {
			for (Componente elem : this.getDocs()) {
				resultado = resultado + elem.dibujar(b).toUpperCase();
			}
		} else {
			for (Componente elem : this.getDocs()) {
				resultado = resultado + elem.dibujar(b);
			}

		}

		return resultado + "\n";
	}

	@Override
	public void remove(Componente componente) {
		if (componente instanceof Caracter) {
			this.getDocs().remove(componente);
		} else {
		}
	}

	@Override
	public void add(Componente componente) {
		if (componente instanceof Caracter) {
			this.getDocs().add(componente);
		} else {
			throw new UnsupportedOperationException();
		}

	}

}
