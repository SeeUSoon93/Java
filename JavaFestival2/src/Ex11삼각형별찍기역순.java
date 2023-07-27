import java.util.Scanner;

public class Ex11삼각형별찍기역순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();

		for (int i = 0; i < hang; i++) {
			for (int k = hang - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
