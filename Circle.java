public class Circle extends Shape {
	private double _radius;
	Circle(String name, Point point, double radius) {
	    super(name, new Point[]{point});
	    this._radius = radius;
	    this._type = "circle";
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
