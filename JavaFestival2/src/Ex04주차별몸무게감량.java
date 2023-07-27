import java.util.Scanner;

public class Ex04주차별몸무게감량 {

	public static void main(String[] args) {
		
		// 1
		Scanner sc = new Scanner(System.in);
		// 2
		System.out.print("현재 몸무게 : ");
		int pw = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int gw = sc.nextInt();
		int mw;
		// 3
		for (int i = 1; pw > gw; i++) {
			// 4
			System.out.print(i + "주차 감량 몸무게 : ");
			mw = sc.nextInt();
			pw -= mw;
		}
		// 4
		System.out.println(pw + "kg 달성!! 축하합니다!");

	}

}
