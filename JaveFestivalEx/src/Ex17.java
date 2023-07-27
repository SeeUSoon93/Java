import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		// 정수 n을 입력받아 계차수열(1,2,4,7 ...)의 n항까지 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int sum = 1;

		int nums[] = new int[n];

		for (int i = 0; i < nums.length; i++) {
			sum += i;
			nums[i] = sum;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
