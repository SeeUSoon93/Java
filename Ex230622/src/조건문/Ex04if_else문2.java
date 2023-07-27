package 조건문;

import java.util.Scanner;

public class Ex04if_else문2 {

	public static void main(String[] args) {

		// 정수를 입력 받아 1의 자리 반올림 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int num2 = num - num % 10; // 버림
		int num3 = num - num % 10 + 10; //올림
		
		if(num % 10 >= 5) {
			System.out.println("반올림 수 : " + num3); 
		}else {
			System.out.println("반올림 수 : " + num2);
		}
		
		
		
	}

}
