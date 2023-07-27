import java.util.Scanner;

public class Ex31채점하기 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);

		System.out.println("===== 채점하기 =====");
		String ans = sc.next();
		// 2
		String ox[] = ans.split("");

		int oxCount = 0;
		int score = 0;
		// 3
		for (int i = 0; i < ox.length; i++) {
			switch (ox[i]) {
			case "o", "O":
				oxCount++;
				score += oxCount;
				break;
			case "x", "X":
				oxCount = 0;
				break;
			}
		}
		System.out.println(score);

	}

}
