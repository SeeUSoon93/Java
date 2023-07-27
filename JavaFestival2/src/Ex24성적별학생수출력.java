
public class Ex24성적별학생수출력 {

	public static void main(String[] args) {
		// 1
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] sco = score.split(",");
		// 2
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		// 3
		for (int i = 0; i < sco.length; i++) {
			if (sco[i].equals("A")) {
				a++;
			}
			if (sco[i].equals("B")) {
				b++;
			}
			if (sco[i].equals("C")) {
				c++;
			}
			if (sco[i].equals("D")) {
				d++;
			}
			if (sco[i].equals("F")) {
				f++;
			}
		}
		// 4
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");

	}

}
