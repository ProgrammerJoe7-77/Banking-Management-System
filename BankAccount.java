import java.util.*;

public class BankAccount {
    String customerName;
    int customerID;
    double balance;
    
    public BankAccount(String accountName, int accountNumber, double accountBalance){
        customerName = accountName;
        customerID = accountNumber;
        balance = accountBalance;
    }
    
    public void deposit(double amountToDeposit){
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit + " into your account");
    }
    
    public void withdraw(double amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just widthdrew " + amountToWithdraw + " out of your account!");
    }
    
    public void checkBalance(){
        balance = balance;
        System.out.println("Your balance is " + balance);
    }
    
    public void showMenu(){
        char option='\0';
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome " + customerName);
        System.out.println("Your account ID is " + customerID);
        System.out.println("\n");
        System.out.println("A. Deposit");
        System.out.println("B. Withdraw");
        System.out.println("C. Check Balance");
        System.out.println("D. Exit");
        
        do {
            System.out.println("===================================");
            System.out.println("Please select an option: ");
            System.out.println("===================================");
            option = input.next().charAt(0);
            System.out.println("\n");
            
            switch(option) {
            case 'A':
                System.out.println("=======================================");
                System.out.println("Enter an amount to deposit: ");
                System.out.println("=======================================");
                int amount1 = input.nextInt();
                deposit(amount1);
                System.out.println("\n");
                break;
                
            case 'B':
                System.out.println("=======================================");
                System.out.println("Enter an amount to withdraw: ");
                System.out.println("=======================================");
                int amount2 = input.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;
                
            case 'C':
                System.out.println("=======================================");
                System.out.println("Your Balance is " + balance);
                System.out.println("=======================================");
                System.out.println("\n");
                break;
                
            case 'D':
                System.out.println("***************************************");
                break;
            
            default:
                System.out.println("Oh no! Invalid option! Please try again.");
                break;
                
            }
        }while (option != 'D');
        System.out.println("Thank you for using our services!");
        
    }

    public static void main(String[] args) {

        BankAccount customer = new BankAccount("Joseph Allen", 12345, 0);
        customer.showMenu();
    }
    
}
