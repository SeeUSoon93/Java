
public class Ex34앞정수가뒤정수로나눠지는지메소드작성하기 {

	public static void main(String[] args) {
		// 2
		int num1 = 11;
		int num2 = 2;
		boolean result = inDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	// 1
	private static boolean inDivide(int num1, int num2) {
		boolean result;
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
