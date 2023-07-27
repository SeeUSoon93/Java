package 조건문;

import java.util.Scanner;

public class Ex02단순if문2 {

	public static void main(String[] args) {

		// 정수 데이터 age 입력받기
		// 조건 : age가 20보다 크거나 같다면
		// true -> "성인입니다!" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다!");
		}
		System.out.println("프로그램 종료!");
		
		
		
	}

}
