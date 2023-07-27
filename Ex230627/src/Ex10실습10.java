
public class Ex10실습10 {

	public static void main(String[] args) {

		char c = 'A';
		System.out.println(c);
		System.out.println(c == 65 ? true : false);

		// 문자 -> 10진수
		System.out.println((int) c);

		// 10진수 -> 문자
		int num = 123;
		System.out.println((char) num);

		///////////////////////////////////////
		// for문을 사용해서 A~Z까지 출력해보기
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		for(char i = 'A'; i <= 'Z';i++)
			System.out.print(i + " ");

	}

}
