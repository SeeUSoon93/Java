
public class Ex15오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩(중복정의)
		
		// 정수 + 정수 add
		// 실수 + 정수 add2
		// 실수 + 정수 + 실수 add3
		int num1 = 2;
		int num2 = 4;
		double num3 = 1.5;
		double num4 = 2.5;
		
		add(num1, num2);
		add2(num3,num2);
		add3(num3,num1,num4);
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add2(double a, int b) {
		System.out.println(a+b);
	}
	public static void add3(double a, int b, double c) {
		System.out.println(a+b+c);
	}

}
