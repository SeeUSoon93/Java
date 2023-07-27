import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {

		System.out.println("==== 채점하기 ====");
		Scanner sc = new Scanner(System.in);

		String ans = sc.nextLine();
		String array[] = ans.split("");
		int score = 0;
		int oxCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("o")) {
				oxCount++;
				score += oxCount;

			}else if(array[i].equals("x")) {
				oxCount = 0;
			}
		}
		System.out.println(score);

	}

}
