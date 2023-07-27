package 조건문;

import java.util.Scanner;

public class Ex07switch문1 {

	public static void main(String[] args) {

		// switch 문
		// 조건식이 아닌 식(값)을 비교할 때 사용
		
		// 선풍기 풍속을 입력받아 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선풍기 풍속을 조절합니다. \n1번 : 약, 2번 : 중, 3번 : 강");
		System.out.print("선택한 번호 : ");
		int fan = sc.nextInt();
		
		switch(fan) {
			
			case 1:
				System.out.println("약한 바람이 나옵니다.");
				break; // 스위치를 끄는 역할(안끄면 밑에는 t/f 관계없이 모두 실행함)
			case 2:
				System.out.println("중간 바람이 나옵니다.");
				break;
			case 3:
				System.out.println("강한 바람이 나옵니다.");
				break;
			default: // 다중if문의 else와 같은 역할
				System.out.println("안틀어줌!!!");
				break;
		}
		
		
		
		
		
		
	}

}
