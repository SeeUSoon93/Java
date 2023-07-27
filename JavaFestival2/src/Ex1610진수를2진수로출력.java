import java.util.Scanner;

public class Ex1610진수를2진수로출력 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력>> ");
		int ten = sc.nextInt();
		String two = "";
		// 2
		for (int i = ten; i > 0; i /= 2) {
			two = i % 2 + two;
		}
		System.out.print(two);

	}

}
