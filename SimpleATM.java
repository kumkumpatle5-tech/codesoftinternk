import java.util.Scanner;

class ATM {
    private double balance = 1000;
    private Scanner sc = new Scanner(System.in);
    
    public void run() {
        while(true) {
            System.out.println("\n1. balance  2. Deposit  3. withdraw  4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            
            if(choice == 1) {
                System.out.println("Balance: " + balance);
            }
            else if(choice == 2) {
                System.out.print("Deposit: ");
                balance += sc.nextDouble();
                System.out.println("Done");
            }
            else if(choice == 3) {
                System.out.print("Withdraw: ");
                double amt = sc.nextDouble();
                if(amt <= balance) {
                    balance -= amt;
                    System.out.println("Done");
                } else {
                    System.out.println("Not enough money!");
                }
            }
            else if(choice == 4) {
                System.out.println("you can leave");
                break;
            }
        }
    }
}

public class SimpleATM {
    public static  void main(String[] args) {
        new ATM().run();
    }
}
