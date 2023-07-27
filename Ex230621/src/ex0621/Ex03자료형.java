package ex0621;

public class Ex03자료형 {

	public static void main(String[] args) {
		
		// 줄 이동 : Alt + 방향키(위, 아래)
		// 줄 복사 : Ctrl + Art + 방향키(위,아래)
		// 줄 삭제 : Ctrl + D
		
		// 변수 선언 -> 자료형 변수명 = 데이터;
		
		// 1. 논리형
		// boolean : 1bit or 1byte (1 or 0)
		// 참 혹은 거짓(true or false)
		boolean isHot = false; // true
		
		// 2. 문자형
		// char : 2byte -> 2^16 -> 65536
		char grade = 'A';
		char num = '4';
		char slash = '\''; // \n, \t 때문에
		
		// 3. 정수형
		// byte : 1byte -> 8bit -> 2^8 -> 256가지(-128 ~ 127)
		byte age = 127;
		
		// short : 2byte -> 16bit -> 2^16 -> 65536(-32768 ~ 32767)
		// int : 4byte -> 정수형의 대표 데이터 타입
		// long : 8byte
		short money = 32767;
		int account = 2100000000;
		long population = 8039279925L; // 실수를 입력하면 int로 인식 -> 뒤에 영어 l/L 붙여주기
		
		// 4. 실수형 -> 소수점 존재
		// float : 4byte
		// double : 8byte
		float height = 164.4f; // 앞에(float) / 뒤에 f,F 붙여서 형변환
		double PI = 3.14159265358;
		
		// 논리형 : boolean
		// 문자형 : char
		// 정수형 : byte short int long
		// 실수형 : float douoble
		
		// 레퍼런스 타입
		// 문자열을 담는 데이터 타입
		// String
		String name = "김군순";
		
		
		
		
		
		
		

	}

}
