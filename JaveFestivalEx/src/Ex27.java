
public class Ex27 {

	public static void main(String[] args) {

		// 2차원배열을 왼쪽으로 90도 회전하여 출력

		int array[][] = new int[5][5];
		int num = 1;
	
		// 왼쪽으로 90도 돌린 배열
		for (int i = 0; i < array.length; i++) {
			for (int j = 4; j >= 0; j--) {
				array[j][i] = num++;
			}
		}
		// 행(j)이 [4]행부터 [0]행으로 점점 주는 동안 열(i)은 [0]으로 유지
		// [0]행까지 가면 열(i)가 [1]으로 넘어감
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}
		
	}

}
