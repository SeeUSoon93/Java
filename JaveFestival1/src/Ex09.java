import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// 단 수 입력
		// 원하는 수까지 입력하여
		// 그만큼만 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("단수입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int gop = sc.nextInt();

		System.out.println(dan + "단");
		for (int i = 1; i <= gop; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
