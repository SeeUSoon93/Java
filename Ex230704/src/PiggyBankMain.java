
public class PiggyBankMain {

	public static void main(String[] args) {

		PiggyBank money = new PiggyBank();
		money.deposit(100000000000000000l);
		money.showMoney();
		money.deposit(1000000000000000000L);
		money.showMoney();

		money.withdraw(999999999999999999L);
		money.showMoney();
	}
}
