package 조건문;

import java.util.Scanner;

public class Ex09switch문3_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("USER 1 : ");
		String user1 = sc.next(); 
		System.out.print("USER 2 : ");
		String user2 = sc.next();
		
		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next();
		System.out.print(user2 + "님 >> ");
		String rsp2 = sc.next();
		
		String rsp = rsp1 + rsp2;
		
		switch(rsp) {
		
		case "가위보", "바위가위", "보바위":
			System.out.println(user1 + "님 승리!");
		break;
		case "보가위", "가위바위", "바위보":
			System.out.println(user2 + "님 승리!");
		break;
		case "가위가위", "바위바위", "보보":
			System.out.println("무승부입니다!");
		break;
		default:
			System.out.println("다시 입력하세용~~!!!!!!!");
		
		}
		
	}

}
