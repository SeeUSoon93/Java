package 월급계산프로그램;

public abstract class Employee {

	// default
	// public : 클래스 내/외부에서 마음대로 접근가능
	// private : 클래스 내부에 설계되어있는 메서드를 통해서만 접근 가능
	// protected : 상속관계에 있는 클래스에서만 접근가능

	String empno; // 사번
	String name; //
	int pay; // 연봉
	int bonus; // 보너스

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	public String print() {
		return empno + " : " + name + " : " + pay;
	}

}
