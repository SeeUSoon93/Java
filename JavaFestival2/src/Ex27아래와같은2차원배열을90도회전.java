
public class Ex27아래와같은2차원배열을90도회전 {

	public static void main(String[] args) {

		int n = 1;
		int nums[][] = new int[5][5];
		// 원래 배열
//		for (int i = 0; i < nums.length; i++) {
//			for (int k = 0; k < nums.length; k++) {
//				nums[i][k] = n++;
//			}
//		}
//		for (int i = 0; i < nums.length; i++) {
//			for (int k = 0; k < nums.length; k++) {
//				System.out.print(nums[i][k]+"\t");
//			}System.out.println();
//		}

		// 90도 회전한 배열
		// 행이 먼저 바뀌므로 k가 행
		// 4행부터 0행까지 k가 줄어듬
		for (int i = 0; i < nums.length; i++) {
			for (int k = 4; k >= 0; k--) {
				nums[k][i] = n++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < nums.length; k++) {
				System.out.print(nums[i][k] + "\t");
			}
			System.out.println();
		}

	}

}
