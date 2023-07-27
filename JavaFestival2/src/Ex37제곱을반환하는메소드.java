
public class Ex37제곱을반환하는메소드 {

	public static void main(String[] args) {

		int base = 2;
		int n = 4;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);
	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}

		return result;
	}

}
