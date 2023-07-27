package while문;

import java.util.Scanner;

public class Ex07실습7 {

	public static void main(String[] args) {

		// 로그인 프로그램 만들기
		// ID : hello, PW : 1234
		// while문 사용
		String id = "김군순";
		String pw = "짱멋짐";	
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//아이디, 비밀번호 입력받기
			System.out.print("아이디를 입력해주세요 >> ");
			String id2 = sc.next();
			System.out.print("비밀번호를 입력해주세요 >> ");
			String pw2 = sc.next();
			// 로그인 성공시 "로그인 성공!" 출력 후 반복문 탈출
			// 로그인 실패시 "아이디와 비밀번호가 잘못되었습니다." 출력 후 반복
			
			if(id.equals(id2) && pw.equals(pw2)) {
					System.out.println("로그인 성공!");
					break;
			}else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}
			
			
		}
		
		
		
		
		
	}

}
