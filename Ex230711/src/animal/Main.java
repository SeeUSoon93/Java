package animal;

public class Main {

	public static void main(String[] args) {

		// Dog, Cat 객체 만들기
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		c.eat();
		d.eat();
		
		// 형제 클래스끼리는 캐스팅 불가
		
		// Upcasting
		// :하위타입을 상위타입으로 형변환
		// a에는 Animal객체가 아니라 Cat객체의 주소값이 들어있음
		// -> 실제 객체가 변환되는게 아니라 껍데기가 상위타입으로 변환되는 것
		Animal a = c;
		a.eat();
		
		// Downcasting
		// : 상위타입을 하위타입으로 형변환
//		Cat c2 = (Cat) new Animal(); // 메모리적으로 불가능
		// 업캐스팅 된 객체를 본래 객체로 변환시켜주는 것!
		Cat c2 = (Cat) a;
		
		
		
		
		
		
		
		
	}

}
