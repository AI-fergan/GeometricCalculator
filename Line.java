import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	Line(String name, Point[] points, Color color) {
		super(name, points);
		this._type = "line";
		this._color = color;
	}

	@Override
	public double getArea() {		
		return 0;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(getPoints()[0].getX() - getPoints()[1].getX(), 2) + Math.pow((getPoints()[0].getY() - getPoints()[1].getY()), 2));
	}

	@Override
	public void draw(Graphics g) {
		Canvas.drawLine(g, this);
	}
	
	
}
