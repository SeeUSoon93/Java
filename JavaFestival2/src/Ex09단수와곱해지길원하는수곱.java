import java.util.Scanner;

public class Ex09단수와곱해지길원하는수곱 {

	public static void main(String[] args) {

		// 1
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int gop = sc.nextInt();
		// 2
		System.out.println(dan + "단");
		// 3
		for (int i = 1; i <= gop; i++) {
			int mul = dan * i;
			System.out.println(dan + "*" + i + "=" + mul);

		}

	}

}
