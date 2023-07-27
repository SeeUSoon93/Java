import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		// 숫자를 입력받고 그 숫자가 이루어진 대시의 총합 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		System.out.println("대시('-')의 총합 >> " + dash(num));
	}

	public static int dash(int a) {
		int result = 0;
		int nums[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (a > 0) {
			int remain = a % 10; // 나머지로 자리별 수 구하기
			a /= 10; // 1의 자리씩 처냄
			result += nums[remain]; // 나머지의 위치는 각 대시 수랑 일치
		}
		return result;
	}

}
