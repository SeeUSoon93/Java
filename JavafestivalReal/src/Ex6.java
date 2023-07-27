
public class Ex6 {

	public static void main(String[] args) {

		int[] array = new int[77];
		for(int a = 77, b =1;a>=1;a--,b++ ) {
			array[b-1]=(a*b);
		}
		int sum = 0;
		for(int i =0; i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}

}
