package 조건문;

import java.util.Scanner;

public class Ex08switch문2 {

	public static void main(String[] args) {

		// ctrl + shift + O -> 전체 import함
		// 한번에 주석처리, 주석풀기 -> ctrl + /
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월 인가요? ");
		int month = sc.nextInt();
		
		switch(month) {
			// 같은 실행문장을 출력하려는 경우 
			case 12, 1, 2:
				System.out.println("겨울");
				break;
			case 3, 4, 5:
				System.out.println("봄");
				break;
			case 6, 7, 8:
				System.out.println("여름");
				break;
			case 9, 10 , 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("다시 입력하세용~");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
