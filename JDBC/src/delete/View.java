package delete;

import java.util.Scanner;

import update.Controller;
import update.MemberDTO;

public class View {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		delete.MemberDTO dto = new delete.MemberDTO(id, pw);
		delete.Controller con = new delete.Controller();
		con.delete(dto);
	}

}
