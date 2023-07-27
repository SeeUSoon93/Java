package update;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("변경할 NAME 입력 : ");
		String name = sc.next();

		MemberDTO dto = new MemberDTO(id, pw, name);
		Controller con = new Controller();
		con.update(dto);

	}

}
