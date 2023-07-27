import java.util.Random;
import java.util.Scanner;

public class Ex12랜덤으로정수2개를뽑고합입력 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int fail = 0;
		
		// 2
		while (true) {
			int num1 = rd.nextInt(9) + 1;
			int num2 = rd.nextInt(9) + 1;
		
			System.out.print(num1 + "+" + num2 + "=");
			int ans = sc.nextInt();
		// 3
			if (ans == num1 + num2) {
				System.out.println("Success!");
			} else {
				System.out.println("fail,,,");
				fail++;
			}
		// 4
			if (fail == 5) {
				System.out.println("GAME OVER");
				break;
			}

		}
	}
}
