import java.util.Scanner;

public class Ex24_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N입력 >>");
		int n= sc.nextInt();		
		System.out.print("X입력 >>");
		int x= sc.nextInt();
		
		int[] nums=new int[n];
		String result = "";
		
		for(int i =1; i<=n;i++) {
			System.out.print(i+"번째 정수 입력>>");
			nums[i-1]=sc.nextInt();
		}
		for(int i =0; i<nums.length;i++) {
			if(nums[i]<x) {
				result += nums[i]+" ";
			}
		}
		System.out.println("결과>> "+result);
		
	}

}
