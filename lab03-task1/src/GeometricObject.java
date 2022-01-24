
public class GeometricObject {
	public String color;
	public boolean filled;
	
	public GeometricObject() {
		this.color = "white";
		this.filled = false;
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "created";
	}
	
}
