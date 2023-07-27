
public class Ex01SequentialSerch {

	public static void main(String[] args) {

		int array[] = { 17, 11, 32, 4, 61, 45, 98, 30, 15 };

		// 내가 찾고 싶은 데이터
		int serch = 61;

		// 쉬운방법이지만 효율이 떨어지는 방법
		for (int i = 0; i < array.length; i++) {
			if (serch == array[i]) {
				System.out.println(serch + "는 " + i + "번 인덱스에 있습니다.");
			}
		}

	}

}
