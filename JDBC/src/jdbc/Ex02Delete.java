package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;

		System.out.print("삭제할 ID를 입력해주세요 >>");
		String id = sc.next();
		System.out.print("비밀번호를 확인하겠습니다. >>");
		String pw = sc.next();

		// 사용자가 입력한 ID와 PW가 일치하는 데이터 행을 삭제해주세요
		// delete
		// where id and pw

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "delete from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (cnt > 0) {
			System.out.println("회원탈퇴 성공!!!!!");
		} else {
			System.out.println("회원탈퇴 실패.....");
		}

	}

}
