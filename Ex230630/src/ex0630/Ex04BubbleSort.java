package ex0630;

import java.util.Arrays;

public class Ex04BubbleSort {

	public static void main(String[] args) {

		// 버블정렬을 이용해 오름차순으로 정렬
		// 비교하기 위해서 처음부터 내림차순으로 초기화

		
		int[] array = { 10, 4, 2, 7, 6 };
		int temp;


		for (int k = 1; k < array.length; k++) {
			for (int i = 0; i < array.length - k; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
		
		
		
//		// step2
//		for (int i = 0; i < array.length - 2; i++) {
//
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//
//			}
//		}
//		// 3step
//		for (int i = 0; i < array.length - 3; i++) {
//
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//
//			}
//		}
//		// 4step
//		for (int i = 0; i < array.length - 4; i++) {
//
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//
//			}
//		}
		

	}

}
