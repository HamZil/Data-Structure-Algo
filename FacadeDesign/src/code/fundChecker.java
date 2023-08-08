package code;

public interface fundChecker {

	double getCashInAccount();
	void decreaseCashInAccount(double cashWithdrawn);
	 void increaseCashInAccount(double cashDeposited);
	 boolean haveEnoughMoney(double cashToWithdrawal);
	 public void makeDeposit(double cashToDeposit);

}
