import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		// 별의 수를 입력받아 배열에 저장
		// 인덱스의 수 만큼 별 출력

		Scanner sc = new Scanner(System.in);
		int star[] = new int[5];

		for (int i = 0; i < star.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			star[i] = sc.nextInt();
		}
		for (int i = 0; i < star.length; i++) {
			System.out.print(i + " : ");
			for (int a = 0; a < star[i]; a++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
