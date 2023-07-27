import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {

		// 8칸 크기의 배열 선언
		// 랜덤수로 초기화 한 후 가장 큰 수와 작은 수 출력

		Random rd = new Random();
		int random[] = new int[8];

		for (int i = 0; i < random.length; i++) {
			random[i] = rd.nextInt(100) + 1;
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}

		int max = random[0];
		int min = random[0];

		for (int i = 0; i < random.length; i++) {
			if (max < random[i]) {
				max = random[i];
			}
			if (min > random[i]) {
				min = random[i];
			}
		}

		System.out.println("");
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
