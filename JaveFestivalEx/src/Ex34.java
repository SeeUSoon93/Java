
public class Ex34 {

	public static void main(String[] args) {

		// 두개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는
		// 메소드 isDivide( ) 를 작성하세요.
		// 이 때, 나누어지면true, 나누어지지 않으면 false을 반환함.
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	private static boolean isDivide(int num1, int num2) {
		boolean result = num1%num2 == 0 ? true : false;
						
		return result;
	}

}
