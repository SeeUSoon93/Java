package insert;

public class Controller {

	// Controller : View와 MOdel 중간다리 역할
	// DAO에서 데이터를 삽입하는 기능 Insert에 접근하는 기능
	
	public void insert(MemberDTO dto) {
		// 1. 틀만
		MemberDAO dao = new MemberDAO();
		int cnt = dao.insert(dto);
		if(cnt >0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
