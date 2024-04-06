
public class Triangle  extends Shape {

	Triangle(String name, Point[] points) {
		super(name, points);
		this._type = "Triangle";
	}

	@Override
	public double getArea() {
		Line line1 = new Line("", new Point[]{getPoints()[0], getPoints()[1]});
		Line line2 = new Line("", new Point[]{getPoints()[0], getPoints()[2]});
		Line line3 = new Line("", new Point[]{getPoints()[1], getPoints()[2]});
	    
	    double s = (line1.getPerimeter() + line2.getPerimeter() + line3.getPerimeter()) / 2;
	    
	    return Math.sqrt(s * (s - line1.getPerimeter()) * (s - line2.getPerimeter()) * (s - line3.getPerimeter()));

	}


	@Override
	public double getPerimeter() {
		Line line1 = new Line("", new Point[]{getPoints()[0], getPoints()[1]});
		Line line2 = new Line("", new Point[]{getPoints()[0], getPoints()[2]});
		Line line3 = new Line("", new Point[]{getPoints()[1], getPoints()[2]});
		
		return line1.getPerimeter() + line2.getPerimeter() + line3.getPerimeter();
	}

}
