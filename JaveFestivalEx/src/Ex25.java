import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		// 8자리 정수를 입력받고
		// 반복문을 사용하여 입력받은 정수의 각 자리별 합을 구하여 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
