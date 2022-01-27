
public class Circle extends GeometricObject{
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getDiameter() {
		return (2 * radius);
	}
}
