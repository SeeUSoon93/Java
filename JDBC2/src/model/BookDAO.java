package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	String data = "";

	// getCon : DB에 연결권한을 확인하는 메서드(기능)
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// getClose
	public void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// insert
	public int insert(BookDTO dto) {
		getCon();
		String sql = "insert into book values(?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, dto.getPrice());
			psmt.setString(4, dto.getBooknum());

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return cnt;
	}

	// slectOne
	public String selectOne(BookDTO dto) {
		getCon();
		String sql = "SELECT * FROM book WHERE title = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getTitle());

			rs = psmt.executeQuery();

			if (rs.next()) {
				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String booknum = rs.getString(4);

				data = data + title + "(" + name + ")" + " : " + price + "원 - " + booknum;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return data;
	}

	// selectAll
	public ArrayList<BookDTO> selectAll() {
		getCon();
		ArrayList<BookDTO> list = new ArrayList<>();

		String sql = "SELECT * FROM book";

		try {
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {

				String title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String booknum = rs.getString(4);

				BookDTO dto = new BookDTO(title, name, price, booknum);
				list.add(dto);

				// 매개변수, 리턴값 없이 바로 출력
//				System.out.printf("[%s(%s) : %d원 - %s]%n", title, name, price, booknum);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return list;

	}

	// delete
	public int delete(BookDTO dto) {
		getCon();
		String sql = "delete from book where booknum = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getBooknum());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return cnt;
	}

	// update
	public int update(BookDTO dto) {
		getCon();
		String sql = "update book set price = ?, booknum = ? where title = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getPrice());
			psmt.setString(2, dto.getBooknum());
			psmt.setString(3, dto.getTitle());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		getClose();
		return cnt;
	}
}
