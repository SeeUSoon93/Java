package 조건문;

import java.util.Scanner;

public class Ex09switch문3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("USER 1 : ");
		String user1 = sc.next(); 
		System.out.print("USER 2 : ");
		String user2 = sc.next();
		
		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next(); 
		
		switch(rsp1) {
			
			case "가위":
				System.out.print(user2 + "님 >> ");
				String rsp2 = sc.next();
				
				switch (rsp2) {
				case "가위":
					System.out.println("무승부입니다!");
					break;
				case "바위":
					System.out.println(user2 + "님 승리입니다!");
					break;
				case "보":
					System.out.println(user1 + "님 승리입니다!");
					break;
				default:
					System.out.println("다시 입력하세요");
				}
		}
	}
}
					

