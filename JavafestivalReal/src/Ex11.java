
public class Ex11 {
	

	public Ex11() {

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인: " + result);
	}

	public boolean isDivide(int num1, int num2) {
		boolean result;
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
