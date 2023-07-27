package animal;

// 추상클래스는 객체를 못만듬
public abstract class Bird extends Animal {
	@Override
	public void walk() {
		System.out.println("날기");
	}

	// body가 없는 추상메소드
	// 상위클래스의 메소드(기능) 무조건 구현시키고 싶을 때 사용
	public abstract void egg();

}
