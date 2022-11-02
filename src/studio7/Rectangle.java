package studio7;

public class Rectangle {
	
	private int width;
	private int length;
	
	public Rectangle(int initwidth, int initlength) {
		width = initwidth;
		length = initlength;
	}
	
	public double calculatePerimeter() {	
		return (2*width)+(2*length);
	}
	
	public double calculateArea() {
		return (width*length);
	}
	
	public boolean isSquare() {
	if (width == length) {
		return true;
	}
	else {
		return false;
	}	
	}

	public static void main(String[] args) {
		Rectangle sarah = new Rectangle(4,7);
		System.out.println("Perimeter: "+ sarah.calculatePerimeter());
		System.out.println("Area: "+ sarah.calculateArea());
		System.out.println("Square? " + sarah.isSquare());
	}

}
