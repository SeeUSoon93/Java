import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Main {

	public static void main(String[] args) {

		// 뮤직 객체 생성하기
		Mp3 sing1 = new Mp3("Anne Marie", "2002", 100, ".\\music\\Anne Marie - 2002.mp3");
		Mp3 sing2 = new Mp3("Billie Eilish", "bad guy", 200, ".\\music\\Billie Eilish - bad guy.mp3");
		Mp3 sing3 = new Mp3("Carmen Twillie, Lebo M.", "Circle of Life", 300,
				".\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		Mp3 sing4 = new Mp3("CHUNG HA", "벌써 12시", 400, ".\\music\\CHUNG HA - 벌써 12시.mp3");
		Mp3 sing5 = new Mp3("Idina Menzel", "Let It Go", 500, ".\\music\\Idina Menzel - Let It Go.mp3");
		Mp3 sing6 = new Mp3("Itzy", "Dalla Dalla", 600, ".\\music\\Itzy - Dalla Dalla.mp3");
		Mp3 sing7 = new Mp3("JENNIE", "SOLO", 700, ".\\music\\JENNIE - SOLO.mp3");
		Mp3 sing8 = new Mp3("Mena Massoud, Naomi Scott", "A Whole New World", 750,
				".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		Mp3 sing9 = new Mp3("Rain", "깡", 800, ".\\music\\Rain - 깡.mp3");
		Mp3 sing10 = new Mp3("Ring Ding Dong", "Ring Ding Dong", 900, ".\\music\\SHINee - Ring Ding Dong.mp3");
		Mp3 sing11 = new Mp3("TWICE", "FANCY", 550, ".\\music\\TWICE - FANCY.mp3");
		Mp3 sing12 = new Mp3("이하이", "NO ONE", 860, ".\\music\\이하이 - NO ONE.mp3");
		Mp3 sing13 = new Mp3("NewJeans", "Cookie", 800, ".\\music\\NewJeans - Cookie.mp3");
		Mp3 sing14 = new Mp3("NewJeans", "Ditto", 900, ".\\music\\NewJeans - Ditto.mp3");
		Mp3 sing15 = new Mp3("NewJeans", "Hype boy", 550, ".\\music\\NewJeans - Hype Boy.mp3");
		Mp3 sing16 = new Mp3("NewJeans", "OMG", 860, ".\\music\\NewJeans - OMG.mp3");

		// 음악 객체를 담을 수 있는 음악 리스트 만들기
		ArrayList<Mp3> list = new ArrayList<Mp3>();

		// 리스트에 음악 넣어주기
		list.add(sing1);
		list.add(sing2);
		list.add(sing3);
		list.add(sing4);
		list.add(sing5);
		list.add(sing6);
		list.add(sing7);
		list.add(sing8);
		list.add(sing9);
		list.add(sing10);
		list.add(sing11);
		list.add(sing12);
		list.add(sing13);
		list.add(sing14);
		list.add(sing15);
		list.add(sing16);

		// 틀 만들기
		// 1번 누르면 재생
		// 2번 누르면 정지
		// 3번 누르면 이전곡
		// 4번 누르면 다음곡
		// 5번 누르면 종료 -> "플레이어를 종료합니다"
		Scanner sc = new Scanner(System.in);
		int index = 0;
		Random rd = new Random();
		MP3Player mp3 = new MP3Player();
		int temp = 0;
		ArrayList<Mp3> copiedList = (ArrayList<Mp3>) list.clone();

		while (true) {

			if (copiedList.size() == 0) {
				System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
				int num = sc.nextInt();
				copiedList = (ArrayList<Mp3>) list.clone();
				if (num == 1) {
					index = rd.nextInt(copiedList.size());
					temp = index;
					String singer = copiedList.get(index).getSinger();
					String title = copiedList.get(index).getTitle();
					int playTime = copiedList.get(index).getPlayTime();
					System.out.println("\n\n============================");
					System.out.printf("  %s - %s(%d초)%n", singer, title, playTime);
					System.out.println("            ◀ ■ ▶");
					System.out.println("============================\n\n");
					mp3.play(copiedList.get(index).getPath());

					copiedList.remove(index);

				} else if (num == 2) {
					mp3.stop();

				} else if (num == 4 || num == 3) {
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					index = rd.nextInt(copiedList.size());
					if (temp == index) {
						if (index == 0) {
							index++;
						} else if (index == copiedList.size()) {
							index--;
						} else {
							index = rd.nextInt(copiedList.size());
						}
					}
					String singer = copiedList.get(index).getSinger();
					String title = copiedList.get(index).getTitle();
					int playTime = copiedList.get(index).getPlayTime();
					System.out.println("\n\n============================");
					System.out.printf("  %s - %s(%d초)%n", singer, title, playTime);
					System.out.println("            ◀ ■ ▶");
					System.out.println("============================\n\n");
					mp3.play(copiedList.get(index).getPath());
					temp = index;
					copiedList.remove(index);

				} else if (num == 5) {
					System.out.println("플레이어를 종료합니다");
					break;
				}
			} else {
				System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
				int num = sc.nextInt();
				if (num == 1) {
					index = rd.nextInt(copiedList.size());
					temp = index;
					String singer = copiedList.get(index).getSinger();
					String title = copiedList.get(index).getTitle();
					int playTime = copiedList.get(index).getPlayTime();
					System.out.println("\n\n============================");
					System.out.printf("  %s - %s(%d초)%n", singer, title, playTime);
					System.out.println("            ◀ ■ ▶");
					System.out.println("============================\n\n");
					mp3.play(copiedList.get(index).getPath());

					copiedList.remove(index);

				} else if (num == 2) {
					mp3.stop();

				} else if (num == 4 || num == 3) {
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					index = rd.nextInt(copiedList.size());
					if (temp == index) {
						if (index == 0) {
							index++;
						} else if (index == copiedList.size()) {
							index--;
						} else {
							index = rd.nextInt(copiedList.size());
						}
					}
					String singer = copiedList.get(index).getSinger();
					String title = copiedList.get(index).getTitle();
					int playTime = copiedList.get(index).getPlayTime();
					System.out.println("\n\n============================");
					System.out.printf("  %s - %s(%d초)%n", singer, title, playTime);
					System.out.println("            ◀ ■ ▶");
					System.out.println("============================\n\n");
					mp3.play(copiedList.get(index).getPath());
					temp = index;
					copiedList.remove(index);

				} else if (num == 5) {
					System.out.println("플레이어를 종료합니다");
					break;
				}
			}
		}
	}
	//

}
