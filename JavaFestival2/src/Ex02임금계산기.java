import java.util.Scanner;

public class Ex02임금계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int laborTime = sc.nextInt();
		int money;

		if (laborTime > 8) {
			money = 8 * 5000 + (laborTime - 8) * 5000 * 15 / 10;
		} else {
			money = 8 * 5000;
		}
		System.out.println("총 임금은 " + money + "원 입니다.");
	}

}
