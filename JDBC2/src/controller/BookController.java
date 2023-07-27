package controller;

import java.util.ArrayList;

import model.BookDAO;
import model.BookDTO;

public class BookController {

	// insert
	public void insert(BookDTO dto) {
		BookDAO dao = new BookDAO();
		int cnt = dao.insert(dto);
		if (cnt > 0) {
			System.out.println("도서등록이 완료되었습니다.");
		} else {
			System.out.println("도서등록에 실패했습니다. 다시 시도하세요.");
		}
	}

	// selectOne
	public void selectOne(BookDTO dto) {
		BookDAO dao = new BookDAO();
		String data = dao.selectOne(dto);
		if (data.equals("")) {
			System.out.println("도서검색에 실패했습니다. 다시 시도하세요.");
		} else {
			System.out.println(data);
		}
	}

	// selectAll
	public void selectAll() {
		BookDAO dao = new BookDAO();
		ArrayList<BookDTO> list = dao.selectAll();

		for (int i = 0; i < list.size(); i++) {
			String title = list.get(i).getTitle();
			String name = list.get(i).getName();
			int price = list.get(i).getPrice();
			String booknum = list.get(i).getBooknum();

			System.out.printf("%d. %s(%s) : %d원 - %s%n", i + 1, title, name, price, booknum);

		}

	}

	// delete
	public void delete(BookDTO dto) {
		BookDAO dao = new BookDAO();
		int cnt = dao.delete(dto);
		if (cnt > 0) {
			System.out.println("책에 대한 정보가 삭제되었습니다.");
		} else {
			System.out.println("책 번호를 다시 한번 확인해주세요.");
		}

	}

	// update
	public void update(BookDTO dto) {
		BookDAO dao = new BookDAO();
		int cnt = dao.update(dto);
		if (cnt > 0) {
			System.out.println("도서 정보가 업데이트되었습니다.");
		} else {
			System.out.println("도서 정보 업데이트에 실패했습니다. 다시 시도하세요.");
		}
	}

}
