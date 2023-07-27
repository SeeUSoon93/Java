import java.util.Arrays;
import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		// 5개의 정수를 입력받아
		// 오름차순 정렬하여 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		int temp;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			nums[i] = sc.nextInt();
		}
		for (int i = 1; i < nums.length; i++) {
			for (int k = 0; k < nums.length - i; k++) {
				if (nums[k] > nums[k + 1]) {
					temp = nums[k];
					nums[k] = nums[k + 1];
					nums[k + 1] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(nums));

	}

}
