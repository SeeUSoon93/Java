package Mp3;

public class Mp3 {

	private String singer;
	private String title;
	private int playTime;
	private String path;

	public Mp3(String singer, String title, int playTime, String path) {
		super();
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}

	// getter메소드
	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}

}
