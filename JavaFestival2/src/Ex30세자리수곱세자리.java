import java.util.Scanner;

public class Ex30세자리수곱세자리 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		// 2
		int num2s[] = new int[3];
		// 3
		for (int i = 0; i < num2s.length; i++) {
			num2s[i] = num2 % 10;
			num2 = num2 / 10;
		}
		System.out.println(num1 * num2s[0]);
		System.out.println(num1 * num2s[1]);
		System.out.println(num1 * num2s[2]);
		System.out.println(num1 * num2s[0] + num1 * num2s[1] * 10 + num1 * num2s[2] * 100);

	}

}
