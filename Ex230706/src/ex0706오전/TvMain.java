package ex0706오전;

public class TvMain {

	public static void main(String[] args) {

		Tv tv = new Tv();

		tv.channel = 5;
		tv.color = "red";

		tv.channelUp();
		tv.channelUp();
		tv.channelDown();

		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널번호 : " + tv.color);

	}

}
