package ex0621;

public class Ex02상수 {

	public static void main(String[] args) {
		// 상수 : 한번 넣으면 변하지 않는 수
		
		// 상수 선언하기
		final int PI = 3;
		
		// num = 10;	
		
		
		// 변수명 작성 규칙(필수)
		// 1. 키워드 사용 금지
		// 2. 대소문자 구분/길이 제한X
		// 3. 숫자로 시작X
		// 4. 특문은'_' , '$'만 가능
				
		// 변수명 작성 규칙(암묵적)
		// 1. 패키지 이름은 소문자 / 클래스 첫 글자는 대문자
		// 2. 변수 이름의 첫 글자는 소문자
		// 3. 상수는 모두 대문자
		// 4. 여러단어인 경우 '_' or 다음 단어 첫 글자 대문자로 시작
		int person_age = 20;  // snake 표기법
		int personAge = 20;   // camel 표기법		
		

	}

}
