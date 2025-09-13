import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 10000; // initial balance (example)
        int choice;

        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrawn Rs. " + withdrawAmount);
                        System.out.println("New balance: Rs. " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance += depositAmount;
                        System.out.println("Successfully deposited Rs. " + depositAmount);
                        System.out.println("New balance: Rs. " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    scanner.close();
                    return; // exit program

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
