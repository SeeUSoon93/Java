import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] nums = new int[n][n];
		int num = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int k = 0; k < n; k++) {
					nums[i][k] = num++;

				}

			} else {
				for (int k = n - 1; k >= 0; k--) {
					nums[i][k] = num++;

				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				System.out.print(nums[i][k] + "\t");
			}
			System.out.println();
		}

	}

}
