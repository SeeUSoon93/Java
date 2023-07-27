import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		// 세자리 수 2개를 입력받아
		// 각 자리별 곱셉 과 결과 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int num2S[] = new int[3];
		
		for(int i = 0; i<num2S.length;i++) {
			num2S[i]=num2%10;
			num2 /= 10;
		}
		int a = num1*num2S[0]; 
		int b = num1*num2S[1]; 
		int c = num1*num2S[2]; 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(100*c+10*b+a);
		
			
		
	}

}
