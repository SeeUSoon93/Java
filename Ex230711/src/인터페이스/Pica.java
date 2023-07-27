package 인터페이스;

public class Pica implements Pokemon {

	@Override
	public void atk() {
		System.out.println("주먹");
	}

	@Override
	public void specialAtk() {
		System.out.println("백만볼트");

	}

	// 인터페이스를 상속할때는 implements(구현) 사용
	// + 다중 상속이 가능하도록 설계되어있음
	// : 기능확장이 용이하도록 만들었음
	
	
	
}
