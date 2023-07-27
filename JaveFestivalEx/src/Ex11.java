import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		// 정수를 입력받아 그 행만큼 내림차순 별 찍기
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();
		
		for(int a = 1; a<=hang; a++) {
			for(int b = hang; b>=a; b--)
				System.out.print("*");
			System.out.println("");
		}
		
	}

}
