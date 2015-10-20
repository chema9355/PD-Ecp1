package calculadoraMementable;

public interface Mementable<T> {
	T createMemento(int valor);

	void restoreMemento(T memento);

}
