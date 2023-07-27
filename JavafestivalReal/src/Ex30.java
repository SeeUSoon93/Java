import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		System.out.println("=== 알파벳 빈도수 구하기===");
		System.out.print("입력 >>");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		String abc = "abcdefghijklmnopqrstuvwxyz";
		String abc2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String[][] alpa = { abc.split(""), abc2.split("") };

		String[] arr = name.split("");
		int[] count = new int[alpa[0].length];

		for (int i = 0; i < alpa[0].length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[k].equals(alpa[0][i])) {
					count[i]++;
				}

			}
		}

		for (int i = 0; i < alpa[0].length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[k].equals(alpa[1][i])) {
					count[i]++;
				}

			}
		}
		for (int i = 0; i < alpa[0].length; i++) {
			System.out.println(alpa[0][i]+" : "+count[i]);
		}
		
		
		
		
		

	}

}
