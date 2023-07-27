
import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		ArrayList<Address> addressList = new ArrayList<Address>();
		Scanner sc = new Scanner(System.in);

		boolean a = true;
		
		while (a) {
			System.out.println("=================주소록=================");
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int num = sc.nextInt();
			System.out.println("======================================");
			switch (num) {
			case 1:
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				Address address = new Address(name, age, phoneNumber);
				addressList.add(address);
				System.out.println("추가가 완료되었습니다.");

				break;

			case 2:
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < addressList.size(); i++) {
						String name2 = addressList.get(i).getName();
						int age2 = addressList.get(i).getAge();
						String phoneNumber2 = addressList.get(i).getPhoneNumber();
						System.out.printf(i + 1 + ". %s(%d세) : %s%n", name2, age2, phoneNumber2);
					}
				}
				break;

			case 3:
				if (addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				} else {
					for (int i = 0; i < addressList.size(); i++) {
						String name2 = addressList.get(i).getName();
						int age2 = addressList.get(i).getAge();
						String phoneNumber2 = addressList.get(i).getPhoneNumber();
						System.out.printf(i + 1 + ". %s(%d세) : %s%n", name2, age2, phoneNumber2);
					}
					System.out.print("삭제할 번호 입력 : ");
					int num2 = sc.nextInt();

					System.out.println(addressList.get(num2 - 1).getName() + "님의 연락처가 삭제되었습니다.");

					addressList.remove(num2 - 1);
				}
				break;

			case 4:
				System.out.print("검색할 이름 입력 : ");
				String name3 = sc.next();
				boolean b = true;

				for (int i = 0; i < addressList.size(); i++) {
					if (name3.equals(addressList.get(i).getName())) {
						String name2 = addressList.get(i).getName();
						int age2 = addressList.get(i).getAge();
						String phoneNumber2 = addressList.get(i).getPhoneNumber();
						System.out.printf("%s(%d세) : %s%n", name2, age2, phoneNumber2);
						b = false;
						break;
					}

				}
				if (b == true) {
					System.out.println("검색한 이름의 정보가 없습니다.");
				}

				break;

			case 5:
				System.out.println("프로그램 종료");
				a = false;
				break;

			}

		}
	}

}
