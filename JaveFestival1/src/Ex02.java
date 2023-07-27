import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 일한 시간을 입력받아 임금 계산
		// 시급은 5000원
		// 8시간 초과 근무시간에 대해 1.5배 적용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일 한 시간을 입력하세요 : ");
		
		int lab = sc.nextInt();
		int im;
		
		if(lab > 8) {
			im = (lab-8)*5000*15/10 + 40000; 
			System.out.println("총 임금은 " + im+ "원 입니다.");
		}else{
			im = lab*5000;
			System.out.println("총 임금은 " + im + "원 입니다.");
		}
		
		
	}

}
