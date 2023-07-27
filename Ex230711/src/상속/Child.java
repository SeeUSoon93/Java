package 상속;

public class Child extends Parent {

	// 자식, 서브, 하위 클래스

	// 재정의 - 오버라이딩
	// 메소드이름 동일, 매개변수 개수 및 데이터 타입 동일, 리턴타입 동일
	public void makeTteokbbokki() {
		System.out.println("맛있게 치즈떡볶이 만들기~");
	}

	public void makeFry() {
		System.out.println("맛있게 튀김 만들기~");
	}
}
