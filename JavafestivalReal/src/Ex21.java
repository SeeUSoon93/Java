
public class Ex21 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int result = point[0] - point[1];

		int first = 0;
		int second = 0;

		for (int i = 0; i < point.length - 1; i++) {
			for (int k = i + 1; k < point.length; k++) {
				if (point[i] < point[k]) {
					if (point[k] - point[i] < result) {
						result = point[k] - point[i];
						first = i;
						second = k;

					}
				} else {
					if (point[i] - point[k] < result) {
						result = point[i] - point[k];
						first = i;
						second = k;

					}
				}
			}
		}
		System.out.println("result = [" + first + ", " + second + "]");

	}
}
