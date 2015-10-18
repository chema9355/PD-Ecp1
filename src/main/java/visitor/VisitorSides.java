package visitor;

public class VisitorSides extends Visitor {

	private double lados;

	public VisitorSides() {
		this.lados = 0;
	}

	@Override
	public void visitSquare(Square square) {
		this.lados = this.lados + square.numberOfSides();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.lados = this.lados + triangle.numberOfSides();
	}

	@Override
	public void visitCircle(Circle circle) {
		this.lados = this.lados + circle.numberOfSides();
	}

	public double getlados() {
		return this.lados;
	}

}
