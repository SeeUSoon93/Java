import java.util.Scanner;

public class Ex01정수입력1의자리반올림 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int rem = num%10;
		
		if(rem>4) {
			num = num-rem+10;
		}else {
			num -= rem;
		}
		System.out.println("반올림 수 : "+ num);
		
	}

}
