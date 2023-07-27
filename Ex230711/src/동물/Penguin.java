package 동물;

public class Penguin extends 동물.Bird {
	
	@Override
	public void move() {
		System.out.println("날지 못함..");
	}
	public void sliding() {
		System.out.println("미끄러지기");
	}
}
