package ex0621;

public class Ex04형변환1 {

	public static void main(String[] args) {
		
		// 자동 형변환, 묵시적 형변환
		// int(4byte) -> double(8byte)
		int a = 3;
		System.out.println("a 값 : " + a);
		
		double b = a;
		System.out.println("b 값 : " + b);
		
		// 강제 형변환, 명시적 형변환
		// double -> int
		double c = 45.9;
		
		int d = (int)c;
		System.out.println("d 값 : " + d);
		
		
		
		
		
		
		
		
	}

}
