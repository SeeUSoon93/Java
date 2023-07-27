package ex0630;

import java.util.Scanner;

public class Ex02이차원배열실습2 {

	public static void main(String[] args) {

		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);

		// 3행 5열 2차원배열 만들기
		int answer[][] = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };
		String correct[] = new String[5];
		int sum = 0;

		for (int i = 0; i < answer[0].length; i++) {
			System.out.print(i + 1 + "번째 답 >> ");
			answer[1][i] = sc.nextInt();
		}
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				correct[i] = "O";
			} else {
				correct[i] = "X";
			}
		}
		for (int i = 0; i < answer[0].length; i++) {
			if (correct[i] == "O") {
				sum += answer[2][i];
			}
		}
		for (int i = 0; i < correct.length; i++) {
			System.out.print(correct[i] + "\t");
		}
		System.out.println();
		System.out.println("총점 : " + sum);
	}

}
