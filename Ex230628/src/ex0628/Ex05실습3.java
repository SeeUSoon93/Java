package ex0628;

public class Ex05실습3 {

	public static void main(String[] args) {

		int array[] = {1,53,7,32,3953,321,33,56,7,1283,3295};
		int max=array[0];
		
		for(int i = 0; i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
				
			}
		}System.out.println("가장 큰 수는 " + max + "입니다.");
		
		
		
		
	}

}
