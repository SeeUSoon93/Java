package while문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("누적결과 : " + sum);
			
			if(num == -1) {
				System.out.println("종료되었어요~");
				break;
			}
			
		}
		
		
	}

}
