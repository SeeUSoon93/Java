package ex0630;

import java.util.Arrays;

public class Ex05SelectinSort {

	public static void main(String[] args) {

		// 선택정렬
		// 가장 큰 원소 또는 가장 작은 원소를 찾아서 주어진 위치를 교체해 나가는 방법
		// 내림차순으로 정렬할건데 가장 큰 원소를 찾기

		// 큰 값만 찾는게 아니라 큰 값의 인덱스를 알아야함
		int[] array = { 10, 4, 2, 7, 6 };

		// 1step : 0~4까지 중 가장 큰 값을 찾아 0번 인데스와 위치를 바꾼다.
		// 98 7 13 70 24
//		int maxIndex = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > array[maxIndex]) {
//				maxIndex = i;
//			}
//		}
//		// 위치 서로 치환하기
//		int temp = array[0];
//		array[0] = array[maxIndex];
//		array[maxIndex] = temp;
//
//		// 2step : 1~4까지 중 가장 큰 값을 찾아 1번 인데스와 바꿈
//		maxIndex = 1;
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] > array[maxIndex]) {
//				maxIndex = i;
//			}
//		}
//		temp = array[1];
//		array[1] = array[maxIndex];
//		array[maxIndex] = temp;

		/////////////////////////
		for (int k = 0; k < array.length; k++) {
			int maxIndex = k;
			for (int i = k; i < array.length; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			int temp = array[k];
			array[k] = array[maxIndex];
			array[maxIndex] = temp;
		}

		System.out.println(Arrays.toString(array));

	}

}
