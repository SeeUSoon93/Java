package view;

import java.util.Scanner;

import controller.BookController;
import model.BookDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("====================== 도서 관리 시스템 ======================");
			System.out.print("[1]도서등록 [2]도서검색 [3]도서전체조회" + "[4]도서삭제 [5]도서정보변경 [6]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) {
				// 도서 등록(insert)
				// 사용자에게 책 제목, 저자, 가격, 번호를 입력받아 DB에 저장
				// 저장이 성공하면 "도서등록이 완료되었습니다"
				// 실패하면 "도서등록에 실패했습니다. 다시 시도하세요"
				sc.nextLine();
				System.out.print("책 제목 : ");
				String title = sc.nextLine();
				System.out.print("저자 : ");
				String name = sc.nextLine();
				System.out.print("가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.print("번호 : ");
				String booknum = sc.nextLine();
				BookController con = new BookController();
				BookDTO dto = new BookDTO(title, name, price, booknum);
				con.insert(dto);

			} else if (select == 2) {
				// 도서검색(selectOne)
				// 사용자가 책제목을 검색했을 떄
				// 데이터가 있으면 "책제목(저자) : 가격 - 책번호" 출력
				// 없으면 "찾으시는 책은 현재 재고가 없습니다."
				sc.nextLine();
				System.out.print("책 제목 : ");
				String title = sc.nextLine();
				BookController con = new BookController();
				BookDTO dto = new BookDTO(title, null, 0, null);
				con.selectOne(dto);

			} else if (select == 3) {
				// 도서전체 조회(selectAll)
				// 책제목 가격 저자 번호
				BookController con = new BookController();
				con.selectAll();

			} else if (select == 4) {
				// 도서삭제(delete)
				// 책 번호를 입력받아서 해당 책에 대한 정보를 삭제해주세요
				// 삭제 성공시 "책에 대한 정보가 삭제되었습니다."
				// 삭제 실패시 "책 번호를 다시 한번 확인해주세요."
				System.out.print("번호 : ");
				sc.nextLine();
				String booknum = sc.nextLine();
				BookController con = new BookController();
				BookDTO dto = new BookDTO(null, null, 0, booknum);
				con.delete(dto);

			} else if (select == 5) {
				// 도서정보변경(update)
				// 책제목을 입력받아 책의 번호와 책의 가격을 변경하자
				sc.nextLine();
				System.out.print("책 제목 : ");
				String title = sc.nextLine();
				System.out.print("변경할 책 번호 : ");
				String booknum = sc.nextLine();
				System.out.print("변경할 책 가격 : ");
				int price = sc.nextInt();

				BookController con = new BookController();
				BookDTO dto = new BookDTO(title, null, price, booknum);
				con.update(dto);

			} else if (select == 6) {
				System.out.println("프로그램 종료");
				break;

			} else {
				System.out.println("다시 선택해주세요.");
			}
		}

	}

}
