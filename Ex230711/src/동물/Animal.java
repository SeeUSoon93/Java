package 동물;

public abstract class Animal {

	// 추상메서드가 정의되어있는 클래스는 반드시 추상클래스가 되어야한다!
	
	
	// 추상클래스는 객체로 생성할 수 없다
	// -> 불완전한 프로그램이기 때문에
	
	public void eat() {
		System.out.println("먹다");
	}

	public void sleep() {
		System.out.println("자다");
	}

	public abstract void move();

}