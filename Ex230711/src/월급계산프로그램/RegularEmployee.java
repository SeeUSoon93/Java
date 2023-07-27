package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 필드
	int bonus; // 보너스

	// 생성자 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay+bonus)/12;
	}

}
