import java.util.Scanner;

public class Ex183의배수만출력 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[10];
		// 2
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 째 정수 입력 >> ");
			nums[i] = sc.nextInt();
		}
		// 3
		System.out.print("3의 배수 : ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 3 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}

}
