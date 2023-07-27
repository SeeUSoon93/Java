import java.util.Arrays;
import java.util.Scanner;

public class Ex33_1 {

	public static void main(String[] args) {

		// 입력된 문장에 포함된 알파벳을 대소문자 구분없이 빈도 구하기

		// 입력받기
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >> ");
		String a = sc.nextLine(); // next는 띄어쓰기 전까지만 받음, Line은 그 뒤로도 받음
		
		// 입력받은 문구를 나누어 배열에 담기
		String[] sen = new String[a.length()];
		sen = a.split("");
		System.out.println(Arrays.toString(sen));

		// 배열 검사해서 빈도수 담기
		int frequency[] = new int[26];

		for (int i = 0; i < sen.length; i++) {
			switch (sen[i]) {
			case "a", "A":
				frequency[0]++;
				break;
			case "b", "B":
				frequency[1]++;
				break;
			case "c", "C":
				frequency[2]++;
				break;
			case "d", "D":
				frequency[3]++;
				break;
			case "e", "E":
				frequency[4]++;
				break;
			case "f", "F":
				frequency[5]++;
				break;
			case "g", "G":
				frequency[6]++;
				break;
			case "h", "H":
				frequency[7]++;
				break;
			case "i", "I":
				frequency[8]++;
				break;
			case "j", "J":
				frequency[9]++;
				break;
			case "k", "K":
				frequency[10]++;
				break;
			case "l", "L":
				frequency[11]++;
				break;
			case "m", "M":
				frequency[12]++;
				break;
			case "n", "N":
				frequency[13]++;
				break;
			case "o", "O":
				frequency[14]++;
				break;
			case "p", "P":
				frequency[15]++;
				break;
			case "q", "Q":
				frequency[16]++;
				break;
			case "r", "R":
				frequency[17]++;
				break;
			case "s", "S":
				frequency[18]++;
				break;
			case "t", "T":
				frequency[19]++;
				break;
			case "u", "U":
				frequency[20]++;
				break;
			case "v", "V":
				frequency[21]++;
				break;
			case "w", "W":
				frequency[22]++;
				break;
			case "x", "X":
				frequency[23]++;
				break;
			case "y", "Y":
				frequency[24]++;
				break;
			case "z", "Z":
				frequency[25]++;
				break;
			}

		}
		// 알파벳 담긴 배열
		char alpabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < frequency.length; i++) {
			System.out.println(alpabet[i] + " : " + frequency[i]);
		}
	}

}
