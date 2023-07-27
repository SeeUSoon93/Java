import java.util.Scanner;

public class PiggyBank {

	// 1. 필드(자본 :money)

	private long money;

	// 2. 메소드(저금 : deposit, 출금 : withdraw, 잔액 : showMoney)

	// 저금하는 메소드
	// 사용자가 저금할 돈을 입력하면(매개변수) 현재 자본에(매개변수) 추가되는 기능
	public void deposit(long input) {
		money += input;
	}

	// 출금하는 메소드
	// 사용자가 출금할 돈을 입력하면(매개변수) 현재 자본(매개변수)에서 차감되는 기능
	public void withdraw(long output) {
		if (money - output > 0) {
			money -= output;
		} else {
			System.out.println("잔액부족");
		}
	}

	// 잔액을 보여주는 메소드
	// 현재 자본을 출력해주는 기능
	public void showMoney() {
		System.out.println("현재 잔액 >> " + money + "원");
	}

}
