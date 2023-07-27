import java.util.Scanner;

public class Ex28N과X를입력받아N개의숫자중X보다작은거 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		int[] array = new int[n];

		// 2
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "번째 정수 입력 >>");
			array[i - 1] = sc.nextInt();
		}
		// 3
		String small = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i] < x) {
				small += array[i] + " ";
			}
		}
		System.out.println("결과 >> " + small);
	}

}
