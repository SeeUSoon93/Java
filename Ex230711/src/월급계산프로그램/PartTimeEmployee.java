package 월급계산프로그램;

public class PartTimeEmployee extends Employee{

	// 필드
	int workDay; // 일수

	// 생성자 메소드
	public PartTimeEmployee(String empno, String name, int pay,int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	public int getMoneyPay() {
		return pay*workDay;
	}

}
