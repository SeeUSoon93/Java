import java.util.Scanner;

public class Ex15팩토리얼값출력 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int factorial = 1;
		// 2
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("출력 : " + factorial);

	}

}
