import java.util.Scanner;

public class Ex01정수입력1의자리에서반올림 {

	public static void main(String[] args) {
		
		// 정수를 입력받기 위한 스캐너 도구
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력받기
		// 입력받은 수는 num, num을 10으로 나눈 나머지를 rem 변수 선언
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int rem = num % 10;

		// 반올림하기 위해 if문 사용
		// 나머지가 5미만이면 버림해야하므로 num = num-rem
		// 나머지가 5이상이면 올림해야하므로 num = num-rem+10
		if (rem < 5) {
			num -= rem;
		} else {
			num = num - rem + 10;
		}
		// 결과 출력
		System.out.println("반올림 수 :" + num);

	}

}
