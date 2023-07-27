import java.util.Random;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		// 랜덤으로 정수 2개 출력하여 사용자는 두 수의 합 입력
		// 합이 정답이면 Success출력, 오답이면 fail 출력
		// fail 5번이면 Game over

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int fail = 0;		
		do {
			int num1 = rd.nextInt(9);
			int num2 = rd.nextInt(9);
			System.out.print(num1 + " + " + num2 + " = ");
			int cor = sc.nextInt();

			if (cor != num1 + num2) {
				System.out.println("fail,,,");
				fail++;
			} else {
				System.out.println("Success!!");
			}

		} while (fail < 5);
		System.out.println("GAME OVER!!");

	}
}
