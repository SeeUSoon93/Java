package 조건문;

import java.util.Scanner;

public class Ex10다중if문변환 {

	public static void main(String[] args) {

		// ctrl + shift + f -> 라인 정렬
		
		Scanner sc = new Scanner(System.in);
		System.out.print("USER 1 : ");
		String user1 = sc.next(); 
		System.out.print("USER 2 : ");
		String user2 = sc.next();
		
		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next(); 
		System.out.print(user2 + "님 >> ");
		String rsp2 = sc.next();
		
		// 이건 이상한 걸 똑같이 입력했을때 무승부가 뜨지않기 하기위해서~~~
		switch(rsp1) {
		case "가위", "바위", "보" :
			switch(rsp2) {
			case "가위", "바위", "보" :
		
		// 가위 바위 보 게임 시작 	
				if(rsp1.equals(rsp2)) {
					System.out.println("무승부!!");
				}else if(rsp1.equals("가위")) {
					
					if(rsp2.equals("바위")) {
						System.out.println(user2 + "님 승리!!");
					}else {
						System.out.println(user1 + "님 승리!!");
				}
				}else if(rsp1.equals("바위")) {
					
					if(rsp2.equals("가위")) {
						System.out.println(user1 + "님 승리!!");
					}else {
						System.out.println(user2 + "님 승리!!");
		     	}
		        }else if(rsp1.equals("보")){
		        	
		        	if(rsp2.equals("가위")) {
		        		System.out.println(user2 + "님 승리!!");
		        	}else {
		        		System.out.println(user1 + "님 승리!!");
		        	}
		        }else {
		        	System.out.println("똑바로 입력해!!!");        	
		        }
			}break;
			default:
				System.out.println("똑바로 입력해!!!");
		}
		
		
}
}
