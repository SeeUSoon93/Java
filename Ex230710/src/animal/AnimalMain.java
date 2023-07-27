package animal;

public class AnimalMain {

	public static void main(String[] args) {

		Animal ani = new Animal();
//		// 추상클래스는 객체를 못만듬
//		Bird bd =new Bird();
		Chiken ch = new Chiken();
		
		ani.hunt();
		ani.slip();
		ani.walk();
//		bd.walk();
//		bd.egg();
		
		ch.egg();
		ch.walk();
		
	}

}
