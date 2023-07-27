package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	public String selectDAO(MemberDTO dto) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String data = "";
		ArrayList<String> member = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERViCE";
			String db_pw = "12345";
			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();
			
			if (rs.next()) {
				String name = rs.getString("NAME");
				data += name;
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

		return data;
	}

}
