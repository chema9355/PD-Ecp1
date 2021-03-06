package text;

public abstract class Componente {
	
	public abstract boolean isEscrito();

	public abstract String dibujar(boolean b);

	public abstract void remove(Componente componente);

	public abstract void add(Componente componente);
}
