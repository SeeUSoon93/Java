package Calculator;

public class Circle extends Figure{

	private double width;
	
	public Circle(double width) {
		this.width = width;
	}
	
	public double calArea() {
		return width*width*3.14;
	}
	
}
