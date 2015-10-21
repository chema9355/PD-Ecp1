package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

	private List<Componente> lista;

	public Escrito() {
		this.lista = new ArrayList<Componente>();
	}

	public List<Componente> getDocs() {
		return this.lista;
	}
	
	public boolean isEscrito(){
		return true;
	}

}
