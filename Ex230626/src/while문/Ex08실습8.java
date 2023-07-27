package while문;

import java.util.Scanner;

public class Ex08실습8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();
			System.out.println("[1] 더하기 [2] 빼기 >> ");
			int ex = sc.nextInt();
			
			if(ex == 1) {
				System.out.println("더하기 연산 결과는 " + (num1 + num2) + "입니다.");
							
			}else if(ex == 2) {
				System.out.println("빼기 연산 결과는 " + (num1 - num2) + "입니다.");
			}else {
					System.out.println("다시입력하세요");				
				}
			System.out.print("다시 실행하시겠습니까? (Y/N) ");
			String an = sc.next();
			
			if(an.equals("N")) {
				System.out.println("종료합니다.");
				break;
				}
		    
				
		}
		
		
	}

}
