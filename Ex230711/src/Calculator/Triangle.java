package Calculator;

public class Triangle extends Figure{

	// 필드
	private double width;
	private double height;

	// 생성자 메소드
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	// 감각형 넓이 계산해주는 메소드
	public double calArea() {
		return width*height/2;
	}
}
