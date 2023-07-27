
public class Ex12메소드6 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);

	}

	public static boolean isDivisor(int a, int b) {
		return (a % b == 0 ? true : false);
	}

}
