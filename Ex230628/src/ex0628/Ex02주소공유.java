package ex0628;

public class Ex02주소공유 {

	public static void main(String[] args) {

		// 배열 -> 레퍼런스 변수 -> 주소값 저장
		// 주소를 공유 -> 같은 공간(배열)을 공유
		int[] intArray = new int[5];
		int[] myArray = intArray;

		System.out.println(intArray);
		System.out.println(myArray);

		intArray[2] = 8;
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);

		myArray[2] = 5;
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);

	}

}
