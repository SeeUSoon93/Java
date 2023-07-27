package ex0628;

public class Ex04실습2 {

	public static void main(String[] args) {

		// 정수형 배열을 선언한 후 임의의 값으로 초기화
		// 배열의 값 중 홀수인 값이 몇개인지 출력하는 프로그램 작성
		// "intArray에 들어있는 홀수는 ㅇㅇㅇㅇㅇ 입니다. 홀수의 총 개수는 5개 입니다."

		int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int odd = 0;
		String oddNum = "";

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 != 0) {
				odd++;
				oddNum = oddNum + intArray[i] + " ";
			}
		}
		System.out.print("intArray에 들어있는 홀수는 " + oddNum + " 입니다. 홀수의 총 개수는 " + odd + "개 입니다.");
	}

}
