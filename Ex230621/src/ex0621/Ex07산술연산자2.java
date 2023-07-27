package ex0621;

public class Ex07산술연산자2 {

	public static void main(String[] args) {

		// 정수 연산 문자 -> 문자(자동 형변환)
		System.out.println(7 + 3 + "7");
		System.out.println(7 + "3" + 7);
		System.out.println("7" + 3 + 7); //순서대로 연산
		
		// 문자 연산 문자 -> 문자
		String lastName = "김";
		String firstName = "군순";
		System.out.println(lastName + firstName);
				
		// 정수
		int a = 10;
		// 문자열
		String b = "9";
		
		System.out.println((a+b).getClass().getName()); // (a+b)의 class가 무엇인지 알아보는 기능
		
		
		
		
	}

}
