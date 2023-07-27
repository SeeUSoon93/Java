package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Select {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "select * from MEMBER where ID = ? and PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			// select는 insert,update,delete와는 달리 DB에서 조회한 결과를 반환
			// Resultset -> 커서 객체
			rs = psmt.executeQuery();

//			System.out.println(rs.next());
			if (rs.next()) {
				// 로그인 성공! -> name님 환영합니다!
//				String name = rs.getString(3);
				String name = rs.getString("NAME");

				System.out.println(name + "님 환영합니다!");
			} else {
				// 로그인 실패! 출력
				System.out.println("로그인 실패!");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
