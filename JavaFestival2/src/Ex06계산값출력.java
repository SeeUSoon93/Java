
public class Ex06계산값출력 {

	public static void main(String[] args) {
		// 1
		int sum = 0;
		String number = "";
		// 2
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= i;
				number += -i + " ";
			} else {
				sum += i;
				number += i + " ";
			}
		}
		// 3
		System.out.println(number);
		System.out.println("결과 : " + sum);

	}

}
