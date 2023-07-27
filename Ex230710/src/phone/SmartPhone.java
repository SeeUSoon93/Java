package phone;

public class SmartPhone extends Phone{
	
	@Override
	public void call() {
		System.out.println("영상통화 걸어요");
	}
	
	public void Mp3play() {
		System.out.println("음악을 재생해요");
	}
	public void Internet() {
		System.out.println("인터넷해요");
	}

}
