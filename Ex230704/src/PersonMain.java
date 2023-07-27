import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		// Person 설계도 클래스를 이용해서 사람(Object)이 만들어지는 클래스

		// 1. 사람(객체) 생성하기
		// 객체를 생성할 때 -> new 키워드 사용
		Person p1 = new Person();
		
		p1.name = "김군순";
		p1.gender = "남자";
		p1.height = 181.2;
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.height);
		
		p1.eat();
		p1.talk();
		
		
		//
		Person p2 = new Person();
		p2.name = "김동현";
		p2.gender = "남자";
		p2.height = 180.2;
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		//
		Person p3 = new Person("순이", "남자", 181.6);
		System.out.println(p3.name);
		System.out.println(p3.gender);
		System.out.println(p3.height);

	}

}
