package ex0629;

public class Ex06이차원배열4 {

	public static void main(String[] args) {

		// 정방향 역방향 번갈아 가면서 출력
		// 홀수 짝수 생각하면 될거같다

		int array[][] = new int[5][5];
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = num++;
				}
			} else {
				for (int j = array[i].length - 1; j > -1; j--) {
					array[i][j] = num++;
				}

			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
