import java.util.Scanner;

public class Ex10메소드4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : "+ result);
		
	}
	public static int close10(int a, int b) {
		int closeA = 10-a;
		int closeB = 10-b;
		
		if(a<10) {
			closeA = 10-a;
		}else {
			closeA = a-10;
		}
		if(b<10) {
			closeB = 10-b;
		}else {
			closeB = b-10;
		}
		
		if(closeA == closeB) {
			return 0;
		}else {
			return closeA<closeB ? a : b;
		}
	}

}
