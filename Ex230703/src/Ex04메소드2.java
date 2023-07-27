import java.util.Scanner;

public class Ex04메소드2 {

	public static void main(String[] args) {

		// 정수 num1, num2, 문자열 s 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 : ");
		String s = sc.next();

		cal(num1, num2, s);

	}

	private static void cal(int num1, int num2, String s) {

		// s가 + i num1 + num2 출력
		// s가 - i num1 - num2 출력
		// s가 * i num1 * num2 출력
		// s가 / i num1 / num2 출력
		if (s.equals("+")) {
			System.out.println(num1 + num2);
		} else if (s.equals("-")) {
			System.out.println(num1 - num2);
		} else if (s.equals("*")) {
			System.out.println(num1 * num2);
		} else if (s.equals("/")) {
			System.out.println(num1 / num2);
		}
	}
}