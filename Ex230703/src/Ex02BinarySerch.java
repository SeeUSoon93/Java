
public class Ex02BinarySerch {

	public static void main(String[] args) {

		// 이진함수
		// 오름차순 or 내림차순으로 정렬된 배열
		int array[] = { 1, 3, 6, 7, 9, 10, 15, 21, 27, 31, 35, 47, 49, 53, 54, 58, 62, 67, 68, 75, 78, 80, 83, 92, 94 };

		int serch = 75;

		int lowIndex = 0;
		int highIndex = array.length - 1;

		while (true) {
			int midIndex = (lowIndex + highIndex) / 2;

			if (serch == array[midIndex]) {
				System.out.println(serch + "는 " + midIndex + "에 있습니다.");
				break;
			} else if (serch > array[midIndex]) {
				lowIndex = midIndex + 1;
			} else if (serch < array[midIndex]) {
				highIndex = midIndex - 1;
			}

		}

	}

}
