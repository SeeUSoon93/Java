
public class Ex13오름차순별찍기좌우대칭 {

	public static void main(String[] args) {
		// 1
		for (int i = 1; i <= 5; i++) {
		// 2	
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
		// 3	
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
