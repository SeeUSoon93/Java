package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Insert {

	public static void main(String[] args) {

		// JDBC 연결 순서 (4단계)
		// 선행작업 -> ojdbc11.jar 추가
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		// 사용자의 id, pw, name, age 입력받기
		System.out.println("==== 회원가입 ====");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();

		try {
			// 1. 동적로딩 Class.forName();
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB 연결(Connection 객체 생성)
			// DB에 접근할 때 접근할 DB의 url, id, pw 필요
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 3. SQL문 작성 및 전송(PreparedStatement 객체)
			String sql = "insert into MEMBER values(?, ?, ?, ?)"; // 바인딩 변수 : ?
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// excuteUpdate() => insert, update, delete
			// excuteQuery() => select
			cnt = psmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 실패");
		} finally {
			// 4. 통로 닫아주기, 자원 반납하기
			try {
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("SQL 실패");
			}

		}
		if (cnt > 0) {
			System.out.println("회원가입 성공!!!!!");
		} else {
			System.out.println("회원가입 실패.....");
		}
	}

}
