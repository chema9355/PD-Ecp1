package visitor;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

	private List<Figure> figures;

	public FiguresManager() {
		figures = new ArrayList<>();
		figures.add(new Square("cuadrado", 1));
		figures.add(new Triangle("triangulo", 1, 1));
	}

	public void add(Figure figure) {
		figures.add(figure);
	}

	public void totalArea() {
		VisitorArea area = new VisitorArea();
		for (Figure figure : figures) {
			figure.accept(area);
		}
		System.out.println("el area total es: " + area.getArea());

	}

	public void totalNumberOfSides() {
		VisitorSides lados = new VisitorSides();
		for (Figure figure : figures) {
			figure.accept(lados);
		}
		System.out.println("el numero de lados total es: " + lados.getlados());
	}

}
