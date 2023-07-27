import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("====Music Play List====");
		ArrayList<String> music = new ArrayList<String>();

		while (true) {
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("[1]원하는 위치에 추가 [2]마지막 위치에 추가 >>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					System.out.print("추가할 위치 : ");
					int musicNum = sc.nextInt();
					sc.nextLine();
					System.out.print("추가할 노래 제목 : ");
					String title = sc.nextLine();
					music.add(musicNum - 1, title);

				} else if (num2 == 2) {
					sc.nextLine();
					System.out.print("추가할 노래 제목 : ");
					music.add(sc.nextLine());
				}

			} else if (num == 2) {
				System.out.println("====현재 재생 목록====");

				if (music.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < music.size(); i++) {
						System.out.println(i + 1 + ". " + music.get(i));
					}
				}
			} else if (num == 3) {
				System.out.print("[1]선택 삭제 [2]전체 삭제 >>");
				int num2 = sc.nextInt();
				if (num2 == 1) {
					System.out.print("삭제할 번호 : ");
					int musicNum = sc.nextInt();
					music.remove(musicNum - 1);
					System.out.println(musicNum - 1+"번 노래가 삭제되었습니다!");

				} else if (num2 == 2) {
					music.clear();
					System.out.println("전체 삭제 성공!");

				}
			} else if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}
}
