package visitor;

public class VisitorArea extends Visitor {

	private double area;

	public VisitorArea() {
		this.area = 0;
	}

	@Override
	public void visitSquare(Square square) {
		this.area = square.area();
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.area = triangle.area();
	}

	@Override
	public void visitCircle(Circle circle) {
		this.area = circle.area();
	}

	public double getArea() {
		return this.area;
	}

}
