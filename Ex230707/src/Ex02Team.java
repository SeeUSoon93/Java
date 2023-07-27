import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> teamList = new ArrayList<String>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			teamList.add(i, sc.next());
		}
		System.out.print("우리 팀의 팀원은 ");
		for (int i = 0; i < teamList.size(); i++) {
			System.out.print(teamList.get(i) + " ");
		}
		System.out.println(" 입니다.");

		System.out.println("================================");
		// 팀원 퇴출시키기
		System.out.print("퇴출시킬 이름 입력 : ");
		String name = sc.next();

		for (int i = 0; i < teamList.size(); i++) {
			if (name.equals(teamList.get(i))) {
				teamList.remove(i);
			}
		}
		System.out.println("================================");
		System.out.print("우리 팀의 팀원은 ");
		for (int i = 0; i < teamList.size(); i++) {
			System.out.print(teamList.get(i) + " ");
		}
		System.out.print(" 입니다.");

	}

}
