import java.util.Scanner;

public class Ex258자리정수를입력받아각자리의합 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		// 2
		for (int i = 0; i < 8; i++) {
			sum += num % 10;
			num = num / 10;
		}
		// 3
		System.out.println("합은 " + sum + "입니다.");
	}

}
