import java.util.Scanner;

public class Ex05A와B둘다0입력받으면종료 {

	public static void main(String[] args) {
		
		// 1
		Scanner sc = new Scanner(System.in);
		// 2
		while (true) {
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();
			System.out.print("B 입력 >> ");
			int b = sc.nextInt();
		// 3	
			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println("결과 >> " + (a - b));
			}
		}

	}

}
