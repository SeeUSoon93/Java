import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int fail = 0;

		while (true) {
			int a = rd.nextInt(9) + 1;
			int b = rd.nextInt(9) + 1;
			System.out.print(a + "+" + b + "=");
			int ans = sc.nextInt();

			if (ans == a + b) {
				System.out.println("Success");
			} else {
				fail++;
				System.out.println("Fail,,,");
			}
			if (fail == 5) {
				System.out.println("GAME OVER!");
				break;
			}

		}

	}

}
