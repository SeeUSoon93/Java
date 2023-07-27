
public class Ex24 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// .split();
		// 반복되는 특정 문자 기준으로 잘라 배열에 반환하는 함수

		String scoreS[] = score.split(",");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		for (String s : scoreS) {
			if (s.equals("A")) {
				a++;
			} else if (s.equals("B")) {
				b++;
			} else if (s.equals("C")) {
				c++;
			} else if (s.equals("D")) {
				d++;
			} else {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
	}

}
