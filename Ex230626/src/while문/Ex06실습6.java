package while문;

import java.util.Scanner;

public class Ex06실습6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pw; // 현재 몸무게
		int fw; // 목표 몸무게
		int wei; // 주차별 감량 몸무게
		int num = 1; // 주차 카운트
		
		System.out.print("현재몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표몸무게 : ");
		fw = sc.nextInt();
				
		
		do {
			
			System.out.print(num++ + "주차 감량 몸무게 : ");
			wei = sc.nextInt();
			pw -= wei;
									
		}while(pw > fw);
	    System.out.println(pw + "kg 달성!! 축하합니당!");
		
		
		
		
	}

}
