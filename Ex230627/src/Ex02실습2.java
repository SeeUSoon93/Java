import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		// 단 입력 받아 구구단 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = "+ dan*i);
		}
		
		
		
	}

}
