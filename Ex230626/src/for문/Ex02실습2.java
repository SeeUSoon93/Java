package for문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int num3;
		if(num1 > num2) {
			for(num3 = num2; num3<= num1 ; num3++) {
				System.out.print(num3 + " ");
			};
		}else {
			for(num3 = num1; num3<= num2 ; num3++) {
				System.out.print(num3 + " ");
			};
				
		}
		
		
		
	}

}
