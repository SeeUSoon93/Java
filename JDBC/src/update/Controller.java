package update;

public class Controller {

	public void update(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(dto);

		if (cnt > 0) {
			System.out.println("변경 성공");
		} else {
			System.out.println("변경 실패");
		}

	}

}
