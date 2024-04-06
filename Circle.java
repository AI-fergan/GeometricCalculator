import java.awt.Color;

public class Circle extends Shape {
	private double _radius;
	Circle(String name, Point point, double radius, Color color) {
	    super(name, new Point[]{point});
	    this._radius = radius;
	    this._type = "circle";	   
	    this._color = color;
	}
	
	public double getRadius() {
		return _radius;
	}
	
	@Override
	public double getArea() {
		return _radius * _radius * 3.14;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * _radius;
	}

}
