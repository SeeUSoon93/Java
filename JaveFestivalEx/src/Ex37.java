import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int base = sc.nextInt();
		System.out.print("제곱 할 수 입력 : ");
		int n = sc.nextInt();
		
		int result = powerN(base,n);
		System.out.println("결과확인 : "+ result);
		
	}
	public static int powerN(int base, int n) {
		int result = base;
		
		for(int i=1;i<n;i++) {
			result = result*base;
		}return result;
		
		
	}

}
