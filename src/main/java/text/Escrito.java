package text;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

	private List<Componente> list;

	public Escrito() {
		this.list = new ArrayList<Componente>();
	}

	public List<Componente> getDocs() {
		return this.list;
	}
	
	public boolean isEscrito(){
		return true;
	}

}
