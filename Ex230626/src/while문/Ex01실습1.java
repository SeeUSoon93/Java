package while문;

import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {

		// while문
		// while(조건식){
		// 반복할 실행문장;
		// }

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			if (num > 10) {
				System.out.println("종료되었어요~");
				break;
			}

		}

	}

}
