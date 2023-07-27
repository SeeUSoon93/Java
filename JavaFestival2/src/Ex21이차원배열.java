import java.util.Scanner;

public class Ex21이차원배열 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		int num = 1;

		// 2
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				array[k][i] = num++;
			}
		}
		// 3
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}

	}

}
