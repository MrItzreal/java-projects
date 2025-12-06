package myProjects.src.banking_system_V2;

public class CheckingAccount extends AccountTypes {

  public CheckingAccount(int accountNumber, String ownerName, double balance) {
    super(accountNumber, ownerName, balance);
  }

  @Override
  public void withdraw(double amount) {
    if (amount <= 0) {
      System.err.println("Withdrawal amount must be greater than zero!");
    } else if (amount > 2000) {
      System.err.println("Withdrawal is limited to $2000 per transaction!");
    } else if (amount > getBalance()) {
      System.err.println("Withdraw cannot be greater than the balance!");
    } else {
      setBalance(getBalance() - amount);
      System.err.println("You withdrew: " + amount);
    }
  }
}
