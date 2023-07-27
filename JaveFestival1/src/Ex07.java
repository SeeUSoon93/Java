
public class Ex07 {

	public static void main(String[] args) {

		// (77*1) + (76*2) + ... + (2*76) + (1*77) 값 출력

		int sums[] = new int[77];
		int sum = 0;

		for (int a = 77, b = 1, i = 0; i < sums.length; i++, a--, b++) {
			sums[i] = a * b;
		}

		for (int i = 0; i < sums.length; i++) {
			sum += sums[i];
		}
		System.out.println(sum);

	}

}
