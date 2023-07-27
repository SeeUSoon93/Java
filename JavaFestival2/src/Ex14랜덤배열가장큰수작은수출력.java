import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex14랜덤배열가장큰수작은수출력 {

	public static void main(String[] args) {

		// 1
		Random rd = new Random();
		int[] nums = new int[8];
		
		// 2
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(100);
		}
		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(nums));

		// 3
		int max = nums[0];
		int min = nums[0];

		// 4
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}

		}
		// 5
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
