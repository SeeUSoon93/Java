import java.util.Scanner;

public class Ex20인덱스의수만큼별출력 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int stars[] = new int[5];
		
		// 2
		for (int i = 0; i < stars.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			stars[i] = sc.nextInt();
		}
		// 3
		for (int i = 0; i < stars.length; i++) {
			System.out.print(stars[i] + ":");
			// 4
			for (int k = 0; k < stars[i]; k++) {
				System.out.print("*");
			}
			// 5
			System.out.println("");

		}
	}

}
