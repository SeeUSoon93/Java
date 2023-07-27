import java.util.Scanner;

public class Ex32문자열2진수를입력받아10진수로바꾸는프로그램 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] two = str.split("");
		// 2
		
		int ten = 0;
		for (int i = 0; i < two.length; i++) {
			int result = 1;
		// 3
			if (two[i].equals("1")) {
				for (int k = 1; k < two.length - i; k++) {
					result = result * 2;
				}
				ten += result;
			}
		}
		System.out.println(str + "(2) = " + ten + "(10)");

	}

}
