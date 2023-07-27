
public class ContactMain {

	public static void main(String[] args) {

		// 객체생성
		Contact con1 = new Contact("김군순", 31, "010-2035-2101", "문흥동");
		Contact con2 = new Contact("최윤석", 32, "010-1111-1111", "첨단");
		Contact con3 = new Contact("임유민", 33, "010-2222-2222", "각화동");
		Contact con4 = new Contact("김동민", 34, "010-3333-3333", "문흥동");

		// 연락처를 담을 수 있는 배열 만들기
		Contact[] contact = new Contact[4];
		contact[0] = con1;
		contact[1] = con2;
		contact[2] = con3;
		contact[3] = con4;

		// 김군순(31세) : 010-2035-2101, 문흥동
		for (int i = 0; i < contact.length; i++) {
			String name = contact[i].getName();
			int age = contact[i].getAge();
			String tel = contact[i].getTel();
			String address = contact[i].getAddress();

			System.out.printf("%d. %s(%d세) : %s, %s%n", i + 1, name, age, tel, address);

		}

//		String name1 = con1.getName();
//		int age1 = con1.getAge();
//		String tel1 = con1.getTel();
//		String address1 = con1.getAddress();
//
//		System.out.printf("%s(%d세) : %s, %s%n", name1, age1, tel1, address1);

	}

}
