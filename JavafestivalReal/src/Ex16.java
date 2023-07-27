import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < 8; i++) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
