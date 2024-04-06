import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private String _name;
	private Point[] _points;
	protected String _type;
	protected Color _color;
	
	/* C'tors */
	Shape(String name, Point[] points) {
		this._name = name;
		this._points = points;
	}
	
	/* Getters */
	public String getName() {
		return this._name;
	}
	
	public Point[] getPoints() {
		return this._points;
	}
	
	public String getType() {
		return this._type;
	}
	
	/* Setters */
	public void setName(String name) {
		this._name = name;
	}
	
	public void setPoints(Point[] points) {
		this._points = points;
	}
	
	@Override
    public String toString() {
        return "name: " + getName() + "\ntype: " + getType() + "\n";
    }
	
	/* Methods */
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void draw(Graphics g);
	
}
