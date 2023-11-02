package studio7;

public class Rectangle {

	private double length; 
	private double width; 
	
	public Rectangle(double length, double width) {
		this.length = length; 
		this.width = width; 
	}
	
	public double area(double l, double w) {
		return length * width; 
	}
	
	public double perimeter(double len, double wid) {
		return 2*length + 2*width; 
	}
	
	public boolean compare(Rectangle B) {
		if (this.area(this.length, this.width) > B.area(B.length, B.width)) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public boolean square() {
		if (this.length == this.width) {
			return true; 
		}
		else {
			return false; 
		}
	}
	
	public static void main(String[] args) {
		Rectangle first = new Rectangle(5, 3); 
		Rectangle second = new Rectangle (7, 2); 
		System.out.println("What is the area and perimeter for the first rectangle?"); 
		System.out.println(first.area(5,3)); 
		System.out.println(first.perimeter(5,3)); 
		System.out.println("Is the first rectangle a square?"); 
		System.out.println(first.square()); 
		System.out.print("What is the area and perimeter for the second rectangle?"); 
		System.out.println(second.area(7, 2)); 
		System.out.println(second.perimeter(7,2)); 
		System.out.println("Is the second rectangle a square?"); 
		System.out.println(second.square()); 
		System.out.println("Is the first rectangle larger than the second rectangle?");
		System.out.println(first.compare(second)); 
		
	}

}
