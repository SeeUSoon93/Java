package 월급계산프로그램;

public class TempEmployee extends Employee{

	// 생성자 메소드
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}
	
	public int getMoneyPay() {
		return pay/12;
	}


}
