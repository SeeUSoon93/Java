package ex0628;

import java.util.Scanner;

public class Ex06실습4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numbers[] = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			numbers[i] = sc.nextInt();
		}

		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double average = 0;
		String num = "";

		for (int i = 0; i < numbers.length; i++) {
			num += numbers[i] + " ";
			sum += numbers[i];

			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		average = (double) sum / 5;

		System.out.println("입력된 점수 : " + num);
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 점수 : " + sum);
		System.out.println("평균 점수 : " + average);

	}

}
