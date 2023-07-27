
public class Mp3 {

	// 음악이란 구조를 컴퓨터한테 알려주는 공간
	// 음악 정보를 담고 있는 공간
	
	// 가수 -> String
	// 제목 -> String
	// 재생시간 -> int
	// 음악파일 경로 -> String
	
	private String singer;
	private String title;
	private int playTime;
	private String path;
	
	// 생성자 메소드
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
