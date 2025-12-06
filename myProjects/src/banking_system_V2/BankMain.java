package myProjects.src.banking_system_V2;

import java.util.Scanner;

public class BankMain {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    double amount;
    boolean isRunning = true;
    int choice;

    // Setting Accounts
    CheckingAccount checking = new CheckingAccount(123, "Dennis Garcia", 50000.00);
    SavingsAccount savings = new SavingsAccount(456, "Dennis Garcia", 15000.00);

    while (isRunning) {
      // DISPLAY MENU
      System.out.println("***************");
      System.out.println("WELCOME TO DSD BANKING");
      System.out.println("****CHECKING-ACCOUNT****");
      System.out.println("1. Show Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Exit");
      System.out.println("***************");
      System.out.println("****SAVINGS-ACCOUNT****");
      System.out.println("5. Show Balance");
      System.out.println("6. Deposit");
      System.out.println("7. Withdraw");
      System.out.println("8. Exit");
      System.out.println("***************");

      System.out.print("Enter your choice (1-8): ");
      choice = scanner.nextInt();

      // GET AND PROCESS USERS CHOICE
      switch (choice) {
        // CHECKING ACCOUNT
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
        case 4 -> isRunning = false;

        // SAVINGS ACCOUNT
        case 5 -> savings.showBalance();
        case 6 -> {
          System.out.print("Enter amount to deposit: ");
          amount = scanner.nextDouble();
          savings.deposit(amount);
        }
        case 7 -> {
          System.out.print("Enter amount to withdraw: ");
          amount = scanner.nextDouble();
          savings.withdraw(amount);
        }
        case 8 -> isRunning = false;
        default -> System.out.println("INVALID CHOICE");
      }
    }
    System.out.println("***************");
    System.out.println("Thank you! Have a nice day!");
    System.out.println("***************");

    scanner.close();
  }

}
