package ex0630;

import java.util.Scanner;

public class Ex01배열실습 {

	public static void main(String[] args) {

		// 프로그램을 실행하면
		Scanner sc = new Scanner(System.in);

		// [1]회원가입 [2]로그인 [3]종료 >>

		// Scanner를 사용해서 정수 입력받기 -> menu변수에 저장

		// menu가 1이면
		// "====회원가입====" 출력
		// menu가 2라면
		// "====로그인===="출력
		// menu가 3이라면
		// "====프로그램 종료====" 출력 -> 프로그램 종료시키기

		// String 배열 : 배열 이름 -> id, 크기 -> 3칸
		// String 배열 : 배열 이름 -> pw, 크기 -> 3칸
		String[] id = new String[3];
		String[] pw = new String[3];

		id[0] = "이주희";
		pw[0] = "1234";

		id[1] = "빅데이터";
		pw[1] = "smart";

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("====회원가입====");
				System.out.print("회원가입할 ID : ");
				id[2] = sc.next();
				System.out.print("회원가입할 PW : ");
				pw[2] = sc.next();

				System.out.println(id[2] + "님 회원가입 성공!");

			} else if (menu == 2) {
				System.out.println("====로그인====");
				System.out.print("ID : ");
				String input_id = sc.next();
				System.out.print("PW : ");
				String input_pw = sc.next();

				// 배열을 돌면서 input_id 와 input_pw가 배열의 값 일치한다면
				// "로그인 성공!"
				// 아니라면
				// "로그인 실패!"

				for (int i = 0; i < id.length; i++) {
					if (input_id.equals(id[i]) && input_pw.equals(pw[i])) {
						System.out.println("로그인 성공!");
						break;
					} else {
						System.out.println("로그인 실패!");
						break;
					}
				}
			} else if (menu == 3) {
				System.out.println("====프로그램 종료====");
				break;
			} else {
				System.out.println("====다시입력하세요====");
			}
		}

	}

}
