
public class Ex23 {

	public static void main(String[] args) {

		// 두개의 숫자를 뽑아 서로의 거리를 비교
		// 거리가 가장 작은 숫자의 위치(index)를 출력

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int result = 0; // 거리가 가장 작을 때 결과값

		int dist = point[0] - point[1]; // 두 수의 거리를 계산하는 값

		int first = 0; // 거리가 작은 수의 첫번째 위치
		int second = 0; // 거리가 작은 수의 두번째 위치

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					if (point[i] < point[j]) {
						result = point[j] - point[i];
						if (dist > result) {
							dist = result;
							first = i;
							second = j;
						}
					} else {
						result = point[i] - point[j];
						if (dist > result) {
							dist = result;
							first = i;
							second = j;
						}
					}
				}

			}
		}
		System.out.println("result = [" + first + ", " + second + "]");
	}

}
