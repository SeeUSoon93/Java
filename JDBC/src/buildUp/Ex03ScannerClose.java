package buildUp;

import java.util.Scanner;

public class Ex03ScannerClose {

	public static void main(String[] args) {

		// 스캐너 사용해서 달러를 입력했을 때 우리나라 돈으로 환전해주는 프로그램
		// while문 사용해서 계속 입력받다가 -1을 입력하면 탈출!
		// 달러 입력 : 2
		// 2600원 입니다.
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("달러 입력 : ");
			int dollar = sc.nextInt();

			if (dollar != -1) {
				double won = dollar * 1294.23;
				System.out.println(won + "원 입니다.");
			} else {
				System.out.println("프로그램 종료");
				break;
			}

		}

		sc.close();
	}

}
