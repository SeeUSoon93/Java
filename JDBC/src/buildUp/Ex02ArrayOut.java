package buildUp;

import java.util.Scanner;

public class Ex02ArrayOut {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
			int a = sc.nextInt();
			System.out.println(100 / 0);	
			System.out.println(array[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("범위~");
		} catch (ArithmeticException e) {
			System.out.println("0~");
		} catch(Exception e) {
			e.printStackTrace(); // 어떤 예외상황이 발생했는지 콘솔창에 출력해주는 친구!
		}
		System.out.println("프로그램 종료");
		
		
		
//		finally {
//			System.out.println("try문 안에서 예외상황이 일어나든 말든 무조건 실행시키는 문법");
//		}
		
		
		
		
	}

}
