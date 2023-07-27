package ex0706오전;

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {

		// 1. 선언 및 생성
		// 배열
		int[] array = new int[5];

		// ArrayList(가변리스트)
		// ArrayList는 Import 해야함
		// ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>();
		// - 클래스형태이기 때문에 import 해야하고,
		// () : 메소드를 사용해서 생성
		// <> : 제네릭기법
		// 데이터타입 -> 객체타입으로 존재해야함. int(정수) -> Integer
		// 생성시 크기 지정하지 않음
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// 크기 알아보기
		System.out.println("배열 크기 : " + array.length);
		System.out.println("ArrayList 크기 : " + arrayList.size());

		// 2. 값 추가
		// 배열
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;

		// ArrayList -> 변수명.add(값) -> 맨 뒤의 인덱스로 추가됨
		// 변수명.add(인덱스,값) -> 원하는 위치에 추가
		arrayList.add(0); // 0 -> 인덱스X, 데이터
		arrayList.add(1); // 0 -> 인덱스X, 데이터
		arrayList.add(2); // 0 -> 인덱스X, 데이터
		arrayList.add(3); // 0 -> 인덱스X, 데이터

		System.out.println("값 추가 후 ArrayList 크기 : " + arrayList.size());

		// 3. 값 조회
		// 배열 -> 변수명[인덱스]
		System.out.println("배열의 0번 인덱스 : " + array[0]);

		// ArrayLIst -> 변수명.get(인덱스)
		System.out.println("ArrayList의 0번 인덱스 : " + arrayList.get(0));

		// for문을 사용해서 arrayList 값 전체 조회
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("ArrayList의 " + i + "번 인덱스 : " + arrayList.get(i));
		}
		
		// 4. 값 삭제 -> 원하는 위치의 값 삭제 : 변수명.remove(인덱스);
		//             모든 값 삭제 : 변수명.removeAll(); / 변수명.clear()
		// 				
		arrayList.remove(1);
		System.out.println("ArrayList의 1번 인덱스 : " + arrayList.get(1));

		arrayList.clear();
		
		System.out.println("클리어 후 ArrayList 크기 : " + arrayList.size());
		
		
	}

}
