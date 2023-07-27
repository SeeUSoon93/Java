import java.util.Scanner;

public class Ex29대시숫자대시개수총합 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		// 2
		int[] sums = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		// 3
		int dashSum = 0;
		while (num > 0) {
			int remain = num % 10;
			dashSum += sums[remain];
			num = num / 10;

		}
		// 4
		System.out.println("대시('-')의 총 합 >> " + dashSum);
	}

}
