import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		// N과 X를 입력받는다
		// N개의 정수를 입력받는다
		// N개의 숫자 중 X보다 작은 수만 출력 한다.

		// n,x를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();

		// 정수를 넣을 배열 생성
		int numbers[] = new int[n];

		String xSmall = "";
		// n개의 정수를 입력받기
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (numbers[i] < x) {
				xSmall += numbers[i] + " ";
			}

		}
		System.out.println("결과 >> " + xSmall);
	}

}
