
public class Ex13메소드7 {

	public static void main(String[] args) {

		// 약수의 합을 구하는 getSum() 메소드 작성

		int num = 100;
		int result = getSum(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num);
	}

	private static void getDivisor(int num) { // 약수
		String div = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				div += i + " ";
			}
		}
		System.out.println(num + "의 약수 : " + div);
	}

	private static int getSum(int num) { // 약수의 합
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
