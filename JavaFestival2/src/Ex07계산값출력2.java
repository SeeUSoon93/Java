
public class Ex07계산값출력2 {

	public static void main(String[] args) {
		
		// 1
		int sum = 0;
		int mul[] = new int[77];

		// 2
		for (int a = 77, b = 1; a > 0; a--, b++) {
			mul[b-1]=(a*b);
		}
		// 3
		for(int i = 0; i<mul.length;i++) {
			sum += mul[i];
		}
		// 4
		System.out.println(sum);
	}

}
