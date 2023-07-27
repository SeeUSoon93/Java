import java.util.Scanner;

public class eX03 {

	public static void main(String[] args) {

		
		// 거스름돈을 입력받아 내어줘야하는 지폐의개수를 출력
		// 단, 최대단위는10000원, 최소단위는100원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		
//		int money = sc.nextInt();
//		int ttw = money/10000;
//		int ftw = money/5000 - 2*ttw;
//		int tw = money/1000 - 10*ttw - 5*ftw;   
//		int fhw = money/500 - 20*ttw - 10*ftw - 2*tw;
//		int hw = money/100 - 100*ttw - 50*ftw - 10*tw - 5*fhw;
//		
//		System.out.println("잔돈 : " + money + "원");
//		System.out.println("10000원 : " + ttw + "개");
//		System.out.println("5000원 : " + ftw + "개");
//		System.out.println("1000원 : " + tw + "개");
//		System.out.println("500원 : " + fhw + "개");
//		System.out.println("100원 : " + hw + "개");
		
		
		// 10000을 나눈 나머지를 잔돈
		// 나눈다음 몫을 다시 5000을 나눈 나머지가 5000원 잔돈
		// ... 이렇게 계산
		int money = sc.nextInt();
		
		
		
		
	}

}
