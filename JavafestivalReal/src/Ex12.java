import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] nums= new int[n][n];
		int num = 1;
		
		for(int i = 0; i<n;i++) {
			for(int k = 0 ; k<n;k++) {
				nums[k][i] =num++; 
			}
		}
		for(int i = 0; i<n;i++) {
			for(int k = 0 ; k<n;k++) {
				System.out.print(nums[i][k]+"\t"); 
			}
			System.out.println("");
		}
	}

}
