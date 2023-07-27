package Mp3;

import java.util.ArrayList;
import java.util.Random;

import javazoom.jl.player.MP3Player;

public class Mp3Player {

	ArrayList<Mp3> list = new ArrayList<Mp3>();
	Random rd = new Random();

	int index = 0;

	MP3Player mp3 = new MP3Player();

	public Mp3Player() {

		// 음악 전체 목록
		Mp3 sing1 = new Mp3("NewJeans", "Cookie", 200, ".\\music\\NewJeans - Cookie.mp3");
		Mp3 sing2 = new Mp3("NewJeans", "Ditto", 200, ".\\music\\NewJeans - Ditto.mp3");
		Mp3 sing3 = new Mp3("NewJeans", "Hype boy", 200, ".\\music\\NewJeans - Hype boy.mp3");
		Mp3 sing4 = new Mp3("NewJeans", "OMG", 200, ".\\music\\NewJeans - OMG.mp3");
		Mp3 sing5 = new Mp3("Ive", "After LIKE", 200, ".\\music\\Ive - After LIKE.mp3");
		Mp3 sing6 = new Mp3("Ive", "LOVE DIVE", 200, ".\\music\\IVE - LOVE DIVE.mp3");
		Mp3 sing7 = new Mp3("(G)I-DLE", "Nxde", 200, ".\\music\\(G)I-DLE - Nxde.mp3");
		Mp3 sing8 = new Mp3("(G)I-DLE", "퀸카 (Queencard)", 200, ".\\music\\(G)I-DLE - 퀸카 (Queencard).mp3");

		list.add(sing1);
		list.add(sing2);
		list.add(sing3);
		list.add(sing4);
		list.add(sing5);
		list.add(sing6);
		list.add(sing7);
		list.add(sing8);

	}

	public Mp3 play() {

		Mp3 m = list.get(index);
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(list.get(index).getPath());
		return m;

	}

	public Mp3 nextPlay() {
		index++;
		if (index == list.size()) {
			index = 0;
		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(list.get(index).getPath());

		return list.get(index);

	}

	public Mp3 previewPlay() {
		index--;
		if (index < 0) {
			index = list.size() - 1;
		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}

		mp3.play(list.get(index).getPath());

		return list.get(index);
	}

	public Mp3 shufflePlay() {
		index = rd.nextInt(list.size());

		if (mp3.isPlaying()) {
			mp3.stop();
		}

		mp3.play(list.get(index).getPath());

		return list.get(index);
	}

	public String stop() {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		return "노래가 정지되었습니다.";
	}

}
