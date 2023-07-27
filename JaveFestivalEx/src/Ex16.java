import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력>> ");
		int n = sc.nextInt();
		String two = "";

		// 2진수변환은 2로 계속 나누어 첫번째 나머지 = 첫번째 자리(오른쪽)
		// 그 몫을 다시 나누어 나머지각 두번쨰
		// 이어가면 됨

		for (int i = n; i > 0; i /= 2) {
			two = i % 2 + two;
		}

		System.out.println("출력 : " + two);
		
	}

}
