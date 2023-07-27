import java.util.Arrays;
import java.util.Random;

public class Ex19중복없이로또뽑기 {

	public static void main(String[] args) {
		// 1
		Random rd = new Random();
		int nums[] = new int[6];
		// 2
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rd.nextInt(44) + 1;
			for (int k = 0; k < i; k++) {
				if (nums[k] == nums[i])
					i--;
			}
		}
		// 3
		for (int i = 0; i < nums.length; i++) {
			System.out.println("행운의 숫자 : " + nums[i]);
		}
		
		////////////////
		for (int i = 0; i < nums.length; i++) {
			for (int k = 0; k < i; k++) {
				if (nums[k] > nums[i]) {
					int temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
				}
			}
		}
		System.out.println("이번주 행운의 숫자 : " + Arrays.toString(nums));
	}

}
