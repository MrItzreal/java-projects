package myProjects.src.banking_system_V2;

import java.util.Scanner;

public class BankMain {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isRunning = true;
    boolean inAccountMenu = true;
    double amount;
    int accountType;
    int choice;

    // Setting Accounts
    CheckingAccount checking = new CheckingAccount(123, "Dennis Garcia", 50000.00);
    SavingsAccount savings = new SavingsAccount(456, "Dennis Garcia", 15000.00);

    while (isRunning) {
      System.out.println("***************");
      System.out.println("WELCOME TO DSD BANKING");
      System.out.println("****SELECT ACCOUNT TYPE****");
      System.out.println("1. Savings Account");
      System.out.println("2. Checking Account");
      System.out.println("3. Exit");

      System.out.print("Enter your choice (1-3): ");
      accountType = scanner.nextInt();

      if (accountType == 1) {

        inAccountMenu = true;

        while (inAccountMenu) {
          System.out.println("***************");
          System.out.println("****SAVINGS-ACCOUNT****");
          System.out.println("1. Show Balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");
          System.out.println("***************");

          System.out.print("Enter your choice (1-4): ");
          choice = scanner.nextInt();

          switch (choice) {
            // SAVINGS ACCOUNT
            case 1 -> savings.showBalance();
            case 2 -> {
              System.out.print("Enter amount to deposit: ");
              amount = scanner.nextDouble();
              savings.deposit(amount);
            }
            case 3 -> {
              System.out.print("Enter amount to withdraw: ");
              amount = scanner.nextDouble();
              savings.withdraw(amount);
            }
            case 4 -> inAccountMenu = false;
            default -> System.out.println("INVALID CHOICE");

          }
        }

      } else if (accountType == 2) {

        inAccountMenu = true;

        while (inAccountMenu) {
          System.out.println("***************");
          System.out.println("****CHECKING-ACCOUNT****");
          System.out.println("1. Show Balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");

          System.out.print("Enter your choice (1-4): ");
          choice = scanner.nextInt();

          switch (choice) {
            case 1 -> checking.showBalance();
            case 2 -> {
              System.out.print("Enter amount to deposit: ");
              amount = scanner.nextDouble();
              checking.deposit(amount);
            }
            case 3 -> {
              System.out.print("Enter amount to withdraw: ");
              amount = scanner.nextDouble();
              checking.withdraw(amount);
            }
            case 4 -> inAccountMenu = false;
            default -> System.out.println("INVALID CHOICE");
          }
        }
      } else {
        isRunning = false;
      }
    }
    System.out.println("***************");
    System.out.println("Thank you! Have a nice day!");
    System.out.println("***************");

    scanner.close();
  }
}