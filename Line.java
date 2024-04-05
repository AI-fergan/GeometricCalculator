
public class Line extends Shape{

	Line(String name, Point[] points) {
		super(name, points);
		this._type = "line";
	}

	@Override
	public double getArea() {		
		return 0;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(getPoints()[0].getX() - getPoints()[1].getX(), 2) + Math.pow((getPoints()[0].getY() - getPoints()[1].getY()), 2));
	}
	
	
}
