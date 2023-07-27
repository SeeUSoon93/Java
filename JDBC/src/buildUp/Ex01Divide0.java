package buildUp;

public class Ex01Divide0 {

	public static void main(String[] args) {

		// 자바에서의 오류
		// 1. 컴파일 오류 : 문법적인 오류
		
		// 2. 런타임 오류 : 실행 시에 나타나는 오류
		
		// try{
		//  예외 상황이 생길 것 같은 문법
		// }catch(Exception e) {
		//	예외 상황을 잡아주는 역할, 표시해주는 역할
		// }
		
		try {
			System.out.println(100/0);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눴네요~");
		}
		
		System.out.println("다음 코드");
		
		
		
		
		
		
	}

}
