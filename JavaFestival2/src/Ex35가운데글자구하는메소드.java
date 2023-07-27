import java.util.Scanner;

public class Ex35가운데글자구하는메소드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(getMiddle(a));

	}

	private static String getMiddle(String a) {
		// 1
		String arr[] = a.split("");
		String result = "";
		// 2
		if (arr.length % 2 == 0) {
			for (int i = arr.length / 2 - 1; i <= arr.length / 2; i++) {
				result += arr[i];
			}
		} // 3
		else if (arr.length % 2 != 0) {
			result = arr[arr.length / 2];
		}
		return result;

	}

}
