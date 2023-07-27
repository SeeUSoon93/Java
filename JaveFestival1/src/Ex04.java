import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 현재몸무게와 목표몸무게를 각각 입력받고
		// 주차별감량 몸무게를 입력받아
		// 목표달성시 축하메세지를 띄우는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int gw = sc.nextInt();
		int dw;
		int i = 1;

		do {
			System.out.print(i++ + "주차 감량 몸무게 : ");
			dw = sc.nextInt();
			pw -= dw;

		} while (pw > gw);
		System.out.println(pw + "kg 달성!! 축하합니당!");

	}

}
