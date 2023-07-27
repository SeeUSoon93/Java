import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		// 입력한 2진수를 10진수로 변환하는 프로그램

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] nums = str.split("");

		int ten = 0;

		for (int i = 0; i < nums.length; i++) {

			int result = 1;

			if (nums[i].equals("1")) {

				for (int k = 1; k < nums.length - i; k++) {
					result = result * 2;
				}
				ten += result;
			}
		}
		System.out.print(str + "(2) = " + ten + "(10)");

	}

}
