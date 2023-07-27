package 조건문;

import java.util.Scanner;

public class Ex06다중if문2 {

	public static void main(String[] args) {

		// 값을 입력받아 나이대 출력하는 프로그램
		// 10대, 20대, 30대까지
		// 그 외 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age >= 10 && age < 20) {
			System.out.println("10대입니다.");
		}else if(age >= 20 && age < 30) {
			System.out.println("20대입니다.");
		}else if(age >= 30 && age < 40) {
			System.out.println("30대입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		
	}

}
