
public class Ex35 {

	public static void main(String[] args) {

		// getMiddle 메소드로 가운데글자 구하기

		System.out.println(getMiddle("test"));
	}

	private static String getMiddle(String string) {
		String result = "";
		String sen[] = string.split("");

		if (string.length() % 2 == 0) {
			int middle = string.length() / 2 - 1;
			for (int i = middle; i < sen.length - (middle); i++) {
				result += sen[i];
			}
		} else if (string.length() % 2 == 1) {
			int middle = string.length() / 2;
			for (int i = middle; i < sen.length - (middle); i++) {
				result += sen[i];
			}
		}
		return result;
	}
}
