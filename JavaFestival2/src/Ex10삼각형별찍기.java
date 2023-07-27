import java.util.Scanner;

public class Ex10삼각형별찍기 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();
		// 2
		for (int i = 1; i <= hang; i++) {
		// 3
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
		// 4
			System.out.println("");
		}

	}

}
