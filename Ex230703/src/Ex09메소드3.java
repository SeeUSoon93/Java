import java.util.Scanner;

public class Ex09메소드3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		int result = lagerNumbers(num1, num2);

		System.out.println("큰 수 확인 : "+result);
	}

	public static int lagerNumbers(int num1, int num2) {

		if (num1 == num2) {
			return 0;
		} else {
			return num1 > num2 ? num1 : num2;
		}

	}

}
