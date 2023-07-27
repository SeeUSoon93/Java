import java.util.Random;
import java.util.Scanner;

public class Ex09실습9 {

	public static void main(String[] args) {

		// 랜덤으로 정수 2개 뽑음
		// 사용자는 두 수의 합을 입력
		// 두 수의 합이 맞으면 Success 출력
		// 틀리면 fail출력
		// 기회는 5번, 5번 틀리면 GAME OVER

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int fail = 0;
		while (true) {

			int num1 = rd.nextInt(9) + 1;
			int num2 = rd.nextInt(9) + 1;

			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();

			if (num1 + num2 == answer) {
				System.out.println("Succese!");
			} else {
				fail++;
				System.out.println("fail,,,");
				if (fail == 5) {
					System.out.println("GAME OVER!");
					break;
				}
			}

		}

	}

}
