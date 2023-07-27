import java.util.Arrays;
import java.util.Scanner;

public class Ex33_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("==== 알파벳 빈도수 구하기 ====\n입력>> ");
		String answer = input.nextLine();

		// 문장을 입력 받아, 글자 단위로 저장
		String[] arr = answer.split("");

		// 알파벳 배열에 집어넣기
		String alp1 = "abcdefghijklmnopqrstuvwxyz";
		String alp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[][] alphabet = { alp1.split(""), alp2.split("") };

		int[] output = new int[26]; // 문장의 알파벳 갯수를 저장할 배열

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < alphabet[0].length; k++) {
				if (arr[i].equals(alphabet[0][k])) {
					output[k]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < alphabet[0].length; k++) {
				if (arr[i].equals(alphabet[1][k])) {
					output[k]++;
				}
			}
		}

		// 알파벳 갯수 출력
		for (int i = 0; i < output.length; i++) {
			System.out.println(alphabet[0][i] + " : " + output[i]);
		}

	}
}
