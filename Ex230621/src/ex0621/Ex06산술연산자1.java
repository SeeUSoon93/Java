package ex0621;

public class Ex06산술연산자1 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		// 출력문을 사용해서 num1과 num2의 +, -, *, /, %
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); //정수연산일때만 몫으로 연산
		System.out.println(num1 % num2);
		
		float num3 = 7.0f;
		float num4 = 3.0f;
		
		// 정수 연산 정수 -> 정수
		System.out.println(num1 / num2); // 2
		
		// 정수 연산 실수 -> 실수
		System.out.println(num1 / num4); // 2.33333
		
		// 실수 연산 정수 -> 실수
		System.out.println(num3 / num2); // 2.33333
		
		
		
		
		
		
		

	}

}
