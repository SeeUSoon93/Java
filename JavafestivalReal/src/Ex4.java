import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		int mon[] = { 10000, 5000, 1000, 500, 100 };
		int count[] = new int[5];

		System.out.println("잔돈 : " + money + "원");

		for (int i = 0; i < mon.length; i++) {
			count[i] = money / mon[i];
			money = money % mon[i];

		}
		for (int i = 0; i < mon.length; i++) {
			System.out.println(mon[i] + " : " + count[i] + "개");
		}
	}

}
