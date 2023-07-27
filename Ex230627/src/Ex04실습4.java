
public class Ex04실습4 {

	public static void main(String[] args) {

		// 2단
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(2 + " * " + i + " = "+ 2*i );
		}
		// 3단
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(3 + " * " + i + " = "+ 3*i );
		}
		// 4단
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(4 + " * " + i + " = "+ 4*i );
		}
		// 5단
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(5 + " * " + i + " = "+ 5*i );
		}
		
		System.out.println("--------------------------------" );
		
		
		
		// 2단부터 9단까지 출력
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = "+ dan*gop);
			}
		}
		
		
		
	}

}
