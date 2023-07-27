import java.util.Arrays;
import java.util.Scanner;

public class Ex265개의정수를입력받아오름차순정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nums[] = new int[5];
		// 1 입력한 숫자 담기
		for (int i = 1; i < 6; i++) {
			System.out.print(i + "번째 수 입력 : ");
			nums[i - 1] = sc.nextInt();
		}
		// 2 입력한 숫자 비교해서 옮겨담기
		int min = nums[0];
		// 3
		for (int i = 0; i < nums.length - 1; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				if (nums[k] < nums[i]) {
					min = nums[k];
					nums[k] = nums[i];
					nums[i] = min;
				}
			}
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(nums));
	}

}
