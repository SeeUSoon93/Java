package ex0628;

import java.util.Random;
import java.util.Scanner;

public class Ex01배열 {

	public static void main(String[] args) {

		// 변수 선언
		int a;

		// 초기화(최초의 할당)
		a = 5;

		// 배열을 선언하고 생성하는 방법
		// 데이터타입[] 레퍼런스변수 = new 데이터타입[배열의 크기];
		int[] numbers = new int[4];

		// 배열 선언
//		int[] numbers2;
//
//		// 배열 생성
//		// new : 생성할 때 쓰는 키워드
//		numbers2 = new int[4];
//
//		// 레퍼런스 타입 - 기본데이터 타입 외 나머지 타입
//		// Scanner, Random, 배열, String...
//		Scanner sc = new Scanner(System.in);
//		Random rd = new Random();
//		String name = new String("이주희");
//		String name2 = "김다희";
//
//		System.out.println(a);
//		System.out.println("배열의 주소값 : " + numbers);
//		
//		// 인덱스 값 접근
//		// 배열의이름[인덱스번호]
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
		
		// 인덱스 값 수정(넣어주기)
		numbers[0] = 3;
		numbers[1] = 6;
		numbers[2] = 9;
		numbers[3] = 12;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		// for문을 사용해서 배열안에 있는 값 출력
		// 배열의 크기 : 배열이름.length
		System.out.println("배열의 크기 : " + numbers.length);
		for(int i=0; i< numbers.length; i++) {     
			System.out.println(numbers[i]);
		}

		// 배열 생성 방법 2가지
		// 1. new 키워드 사용해서 생성
		// new 데이터타입[배열크기];
		System.out.println("---------------------");
		// 2. 배열 선언과 동시에 초기화
		// 배열 안에 어떤 데이터가 들어갈지 명확하게 알 때
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(array.length);
		System.out.println(array[6]);
		
		System.out.println("---------------------");
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		
	}
}
