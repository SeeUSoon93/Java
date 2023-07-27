import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {

		// 단과 곱해지는 수 입력받아 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단과 곱해지는 수 입력받아서 구구단 작성");
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.print("곱해지는 수 입력 : ");
		int gob = sc.nextInt();
		
		for(int i = 1; i<= gob; i++) {
			System.out.println(dan + " * " + i + " = "+ dan*i);
		}
		
		
	}

}
