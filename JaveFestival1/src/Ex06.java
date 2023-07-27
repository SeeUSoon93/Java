
public class Ex06 {

	public static void main(String[] args) {

		// 1-2+3-4+…+99-100를 계산하여 답을 출력하시오

		int num = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num -= i;
				System.out.print("-" + i + " ");
			} else {
				num += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\t");
		System.out.println("결과 : " + num);

	}

}
