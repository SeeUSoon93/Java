package ex0621;

import java.util.Scanner;

public class Ex08산술연산자3 {

	public static void main(String[] args) {

		// 정수 입력받기 -> Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num/100 + "00");
		System.out.println(num - num % 100);
		System.out.println(num/100*100);
		
		//강제형변환
		System.out.println((int)(num*0.01)*100);
		
		
		
		
		
		
	}

}
