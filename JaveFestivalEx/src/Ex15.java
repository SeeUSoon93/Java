import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		// 정수입력받아 팩토리얼 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");

		int num = sc.nextInt();
		int pac = 1;

		for (int i = 1; i <= num; i++) {
			pac = pac * i;
		}
		System.out.println("출력 : " + pac);

	}

}
