package ex0628;

public class Ex03실습1 {

	public static void main(String[] args) {

		// 문자열 데이터를 담을 수 있는 배열 선언
		String arrStr[];
		
		// 문자열 데이터 10개를 담을 수 있는 배열 생성
		arrStr = new String[10];
		
		// 0번 인덱스부터 차례대로 값 5개 넣기
		// JAVA, HTML, DB, PYTHON, CSS
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PYTHON";
		arrStr[4] = "CSS";
		
		// for문 사용해서 배열 값 출력하기
		for(int i = 0; i<arrStr.length; i++) {
			System.out.print(arrStr[i] + ", ");
		}
		
		
		
		
		
	}

}
