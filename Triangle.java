import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {

	Triangle(String name, Point[] points, Color color) {
		super(name, points);
		this._type = "Triangle";
		this._color = color;
	}

	@Override
	public double getArea() {
		Line line1 = new Line("", new Point[]{getPoints()[0], getPoints()[1]}, Color.black);
		Line line2 = new Line("", new Point[]{getPoints()[0], getPoints()[2]}, Color.black);
		Line line3 = new Line("", new Point[]{getPoints()[1], getPoints()[2]}, Color.black);
	    
	    double s = (line1.getPerimeter() + line2.getPerimeter() + line3.getPerimeter()) / 2;
	    
	    return Math.sqrt(s * (s - line1.getPerimeter()) * (s - line2.getPerimeter()) * (s - line3.getPerimeter()));

	}


	@Override
	public double getPerimeter() {
		Line line1 = new Line("", new Point[]{getPoints()[0], getPoints()[1]}, Color.black);
		Line line2 = new Line("", new Point[]{getPoints()[0], getPoints()[2]}, Color.black);
		Line line3 = new Line("", new Point[]{getPoints()[1], getPoints()[2]}, Color.black);
		
		return line1.getPerimeter() + line2.getPerimeter() + line3.getPerimeter();
	}

	@Override
	public void draw(Graphics g) {		
		Canvas.drawTriangle(g, this);
	}

}
