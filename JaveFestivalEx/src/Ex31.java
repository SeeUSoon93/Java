import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		// 채점을 하는데 이상하게 함
		// 연속된 o의 개수만큼 점수로 책정

		Scanner sc = new Scanner(System.in);
		System.out.println("=====  채점하기  =====");

		// 문자를 입력받고 문자열 길이만큼의 배열 생성
		// 문자열을 한 문자 단위로 나누기
		String cor = sc.next();
		String ox[] = new String[cor.length()];
		ox = cor.split("");

		// O의 개수를 셀 변수와 점수를 담을 변수 선언
		int oCount = 0;
		int sum = 0;

		// 배열을 다 검사할때까지 for문
		// 스위치문으로 O이면 O의 개수 증가 및 점수에 O의 개수만큼 플러스
		for (int i = 0; i < ox.length; i++) {
			switch (ox[i]) {
			case "O": {
				oCount++;
				sum += oCount;
				break;
			}
			// X인 경우 O의 개수는 0으로 되돌아감
			case "X": {
				oCount = 0;
				sum += oCount;
				break;

			}
			}
		}
		System.out.println(sum);

	}

}
