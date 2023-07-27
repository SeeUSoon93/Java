import java.util.Arrays;

public class Ex23두수를뽑아거리비교 {

	public static void main(String[] args) {
		// 1
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// 2
		int min = point[0] - point[1];
		// 3
		int first = point[0];
		int second = point[1];
		// 4
		for (int i = 0; i < point.length; i++) {
			for (int k = 1; k < point.length; k++) {
				// 5
				if (i != k) {
					// 6
					if (point[i] < point[k]) {
						if (point[k] - point[i] < min) {
							min = point[k] - point[i];
							first = i;
							second = k;
						}
						// 6
					} else {
						if (point[i] - point[k] < min) {
							min = point[i] - point[k];
							first = i;
							second = k;
						}
					}
				}
			}
		}
		// 7
		int array[] = new int[2];
		array[0] = first;
		array[1] = second;
		// 8
		System.out.println("result = " + Arrays.toString(array));
	}

}
