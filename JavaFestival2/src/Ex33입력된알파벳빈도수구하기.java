import java.util.Scanner;

public class Ex33입력된알파벳빈도수구하기 {

	public static void main(String[] args) {
		// 1. 기본 출력창, 문자열 입력받기
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		String a = sc.nextLine();

		// 2. 문자열을 쪼개서 배열에 저장
		String[] as = a.split("");

		// 3. 알파벳 대소문자를 각각 담은 배열
		String alp1 = "abcdefghijklmnopqrstuvwxyz";
		String alp2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alps[][] = { alp1.split(""), alp2.split("") };

		// 4. 알파벳 갯수를 카운트할 배열
		int[] alpCount = new int[26];

		// 5. 소문자 검사
		for (int i = 0; i < as.length; i++) {
			for (int k = 0; k < 26; k++) {
				if (as[i].equals(alps[0][k])) {
					alpCount[k]++;
				}
			}
		}
		// 6. 대문자 검사
		for (int i = 0; i < as.length; i++) {
			for (int k = 0; k < 26; k++) {
				if (as[i].equals(alps[1][k])) {
					alpCount[k]++;
				}
			}
		}
		// 7. 출력
		for (int i = 0; i < alpCount.length; i++) {
			System.out.println(alps[0][i] + " : " + alpCount[i]);
		}
	}
}
