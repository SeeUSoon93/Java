
public class Ex14메소드8 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;
		System.out.print("2 ~ 1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);
	}

	private static void getPerfectNumber(int startValue, int endValue) {

		String perfectNumber = "";
		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if (sum == i) {
				perfectNumber += i + " ";
			}
		}
		System.out.print(perfectNumber);

	}

}
