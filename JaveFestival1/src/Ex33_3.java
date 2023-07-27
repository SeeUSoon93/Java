import java.util.Scanner;

public class Ex33_3 {

	public static void main(String[] args) {
		// 알파벳 담을 배열
		char[] array = new char[26];
		
		// 아스키 코드로 배열에 알파벳 담기
		for (int i = 0; i < 26; i++) {
			array[i] = (char) (97 + i);
		}
		// 문구 입력받기
		System.out.print("==== 알파벳 빈도수 구하기 ====\n입력>> ");
		Scanner input = new Scanner(System.in);

		String answer = input.nextLine().toLowerCase();
		
		
		int[] answer_array = new int[26];

		int n = array.length;
		int m = answer.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (array[i] == answer.charAt(j)) {
					count++;
				}
			}
			answer_array[i] = count;
			System.out.println((char) (97 + i) + " : " + answer_array[i]);
			count = 0;
		}

		input.close();

	}

}
