package visitor;

public abstract class Figure implements Element {

	public Figure(String description) {
	}

	public abstract double area();

	public abstract double numberOfSides();
}
