
public class CircleWithException {
	int radius;
	
	public CircleWithException(int radius) throws Exception {
		this.radius = radius;
		if(radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}else if(getArea() > 1000) {
			throw new Exception("area cannot be bigger than 1000");
		}
	}
	
	public int getRadius(){
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public int getDiameter() {
		return radius * 2;
	}
}
