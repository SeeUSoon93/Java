import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		// 정수를 입력받아 3의 배수만 출력

		Scanner sc = new Scanner(System.in);

		int nums[] = new int[10];
		String thr = "";

		for (int i = 0; i < nums.length; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>> ");
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 3 == 0) {
				thr += nums[i] + " ";
			}
		}

		System.out.println("3의 배수 : " + thr);

	}

}
