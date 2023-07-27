import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		// 정수 N을 입력받아 N*N배열에 저장하고 출력
		// 열방향으로 숫자가 늘어남
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int array[][] = new int[n][n];
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
