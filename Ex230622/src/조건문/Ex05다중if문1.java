package 조건문;

import java.util.Scanner;

public class Ex05다중if문1 {

	public static void main(String[] args) {

		// 점수가 90점 이상 -> A학점
		// 점수가 80점 이상 90점 미만 -> B학점
		// 점수가 70점 이상 80점 미만 -> C학점
		// 그 외에는 -> "재수강"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int grade = sc.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점");
		}else if(grade >= 80){
			System.out.println("B학점");
		}else if(grade >= 70){
			System.out.println("C학점");
		}else {
			System.out.println("재수강");
		}
		
	}

}
