package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;

		System.out.print("ID를 입력해주세요 >>");
		String id = sc.next();
		System.out.print("PW를 입력해주세요 >>");
		String pw = sc.next();
		System.out.print("변경할 NAME을 입력해주세요 >>");
		String name = sc.next();
		
		// 사용자가 입력한 id,pw와 일치하는 name의 값을 변경
		// update 테이블명 set 열 = '변경할값' where 조건
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "update member set id = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

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
			System.out.println("NAME 변경 성공!!!!!");
		} else {
			System.out.println("NAME 변경 실패.....");
		}
		
		
		
	}

}
