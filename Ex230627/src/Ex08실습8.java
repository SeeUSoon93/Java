
public class Ex08실습8 {

	public static void main(String[] args) {

		// 오름차순 별찍기
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------------");
		
		// 내림차순 별찍기
		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b >= a; b--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------------");
		
		// 오름차순 좌우대칭 별찍기
		for (int a = 1; a <= 5; a++) {
			for (int b = 4; b >= a; b--) {
				System.out.print(" ");
			}for (int c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-----------------------");
		
		// 내림차순 좌우대칭 별찍기
		for (int a = 1; a <= 5; a++) {
			for (int b = 2; b <= a; b++) {
				System.out.print(" ");
			}for (int c = 5; c >= a; c--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}