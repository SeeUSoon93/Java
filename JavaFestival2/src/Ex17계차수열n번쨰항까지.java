import java.util.Scanner;

public class Ex17계차수열n번쨰항까지 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int sum = 1;
		// 2
		for (int i = 0; i < n; i++) {
			sum += i;
			System.out.print(sum + " ");
		}

	}

}
