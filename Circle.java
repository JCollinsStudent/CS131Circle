
public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double calculateArea(double r) {
		double area = Math.PI*Math.pow(r, 2);
		return area;
	}
}
