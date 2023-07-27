import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();
		
		for(int i = 0; i<hang;i++) {
			for(int k = 0 ; k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
