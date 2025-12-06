package myProjects.src.banking_system_V2;

import java.util.Scanner;

public abstract class AccountTypes {
  static Scanner scanner = new Scanner(System.in);

  private int accountNumber;
  private String ownerName;
  private double balance;

  public AccountTypes(int accountNumber, String ownerName, double balance) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = balance;
  }

  // Getters/Setters
  public int getAccountNumber() {
    return accountNumber;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  // Methods
  public void deposit(double amount) {
    if (amount < 0) {
      System.err.println("Amount can't be negative");
    } else {
      setBalance(getBalance() + amount);
      System.err.println("You Deposited: " + amount);
    }
  }

  public void showBalance() {
    System.out.println("***************");
    System.out.printf("$%.2f\n", getBalance());
  }

  public abstract void withdraw(double amount);
}
