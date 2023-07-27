import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ex19 {

	public static void main(String[] args) {

		// 중복없이 랜덤으로 로또 번호 받기

		int lotto[] = new int[6];
		Random rd = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(44) + 1; // 1 ~ 45까지의 난수
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j])
					i--;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}

		// 뽑힌 숫자를 오름차순으로 보여주기

		for (int k = 1; k < lotto.length; k++) {
			for (int i = 0; i < lotto.length - 1; i++) {
				if (lotto[i] > lotto[i + 1]) {
					int temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
