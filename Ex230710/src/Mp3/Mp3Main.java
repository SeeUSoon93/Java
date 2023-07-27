package Mp3;

import java.util.Scanner;

public class Mp3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Mp3Player p = new Mp3Player();
		boolean check = true;
		Mp3 m;
		
		while (check) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]셔플재생 [6]종료 >>");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				m = p.play();
				System.out.println("==================================");
				System.out.println(mInfo(m));
				System.out.println("             ◀ ■ ▶");
				System.out.println("==================================");
				break;
			case 2:
				String mp = p.stop();
				System.out.println(mp);
				break;
			case 3:
				m = p.previewPlay();
				System.out.println("==================================");
				System.out.println(mInfo(m));
				System.out.println("             ◀ ■ ▶");
				System.out.println("==================================");
				break;
			case 4:
				m = p.nextPlay();
				System.out.println("==================================");
				System.out.println(mInfo(m));
				System.out.println("             ◀ ■ ▶");
				System.out.println("==================================");
				break;
			case 5:
				m = p.shufflePlay();
				System.out.println("==================================");
				System.out.println(mInfo(m));
				System.out.println("             ◀ ■ ▶");
				System.out.println("==================================");
				break;
			case 6:
				mp = p.stop();
				System.out.println("프로그램 종료");
				check = false;
				break;
			}
		}
	}

	private static String mInfo(Mp3 m) {
		return m.getSinger() + " - " + m.getTitle() + "(" + changeTime(m) + ")";
	}

	private static String changeTime(Mp3 m) {
		return m.getPlayTime() / 60 + "분" + m.getPlayTime() % 60 + "초";

	}
}
