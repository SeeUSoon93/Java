package select;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

	public void selectCon(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		String data = dao.selectDAO(dto);

		if (data.equals("")) {
			System.out.println("로그인 실패!");
		} else {
			System.out.println(data + "님 환영합니다!");
		}
	}

}
