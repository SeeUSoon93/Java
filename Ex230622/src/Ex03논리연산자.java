
public class Ex03논리연산자 {

	public static void main(String[] args) {

		// 논리연산자
		// 부정연산자(NOT) -> !
		// 앞선 값의 반대값을 나타내고 싶을 때 사용!
		
		boolean check = true;
		System.out.println(!check);
		
		int a = 5;
		int b = 13;
		System.out.println(!(a > b));

		System.out.println("---------------------------");
		
		// AND 연산자(곱 연산자) -> &&
		System.out.println((10 > 3) && (10 < 4));
		System.out.println((10 > 3) && (10 < 11));
		System.out.println((10 > 24) && (10 <= 11));
		System.out.println((10 != 24) && (10 < 4));
		
		System.out.println("----------------------------");
		
		// OR 연산자(합 연산자) -> ||
		System.out.println((3 == 3) || (5 != 3));
		System.out.println((3 >= 3) || (5 < 3));
		System.out.println((3 > 3) || (5 != 3));
		System.out.println((3 == 6) || (5 < 3));
		
		// &&는 곱 연산자, ||는 합 연산자 -> &&먼저 연산
		
		
		
		
		
		
		
		
		
		
	}

}
