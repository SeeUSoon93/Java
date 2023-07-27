import java.util.Scanner;

public class Ex03거스름돈계산 {

	public static void main(String[] args) {

		// 1
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		// 2
		int money = sc.nextInt();
		// 3
		System.out.println();
		System.out.println("잔돈 : " + money + "원");
		// 4
		int arr[] = { 10000, 5000, 1000, 500, 100 };
		int arr2[] = new int[5];
		// 5
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = money / arr[i];
			money = money % arr[i];
			System.out.println(arr[i] + "원 : "+arr2[i] + "개");

		}

	}

}
