import java.util.Scanner;

public class ATM {
  private static int balance = 100000;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter User ID: ");
    int userID = sc.nextInt();
    System.out.print("Enter Pin: ");
    int pin = sc.nextInt();

    if (userID == 451874 && pin == 1234) {
      System.out.println("Access granted.");
      boolean run = true;
      while (run) {
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
          case 1:
            System.out.println("Your current balance is: " + balance);
            break;
          case 2:
            System.out.print("Enter the amount to withdraw: ");
            int withdrawAmount = sc.nextInt();
            if (withdrawAmount > balance) {
              System.out.println("Insufficient balance.");
            } else {
              balance = balance - withdrawAmount;
              System.out.println("Withdrawn " + withdrawAmount + ". Current balance: " + balance);
            }
            break;
          case 3:
            System.out.print("Enter the amount to deposit: ");
            int depositAmount = sc.nextInt();
            balance = balance + depositAmount;
            System.out.println("Deposited " + depositAmount + ". Current balance: " + balance);
            break;
          case 4:
            System.out.print("Enter the transfer amount: ");
            int transferAmount = sc.nextInt();
            if (transferAmount > balance) {
              System.out.println("Insufficient balance.");
            } else {
              balance = balance - transferAmount;
              System.out.println("Transferred " + transferAmount + ". Current balance: " + balance);
            }
            break;
          case 5:
            System.out.println("Exiting...");
            run = false;
            break;
          default:
            System.out.println("Invalid choice.");
            break;
        }
      }
    } else {
      System.out.println("Access denied.");
    }
  }
}
