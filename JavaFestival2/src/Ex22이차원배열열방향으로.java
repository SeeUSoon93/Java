import java.util.Scanner;

public class Ex22이차원배열열방향으로 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 1;
		int nums[][] = new int[n][n];

		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < nums.length; k++) {
				nums[i][k] = number++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < nums.length; k++) {
				System.out.print(nums[i][k] + "\t");
			}
			System.out.println("");
		}

	}

}
