import java.util.Scanner; 
public class Banking_Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
 
        BankDetails Cust = new BankDetails();  
        // System.out.print("How many number of customers do you want to input? ");  
        // int n = sc.nextInt();
            Cust.openAccount(); 
            Cust.showAccount();
            // BankDetails Cust[] = new BankDetails[n];  
            // for (int i = 0; i < Cust.length; i++) {  
            //     Cust[i] = new BankDetails();  
            //     Cust[i].openAccount();  
            // }

            int ch;  
            do {  
                System.out.println("\n ***Banking System Application***");  
                System.out.println("1. Display all account details \n 2. Deposit the amount \n 3. Withdraw the amount \n 5.Exit ");  
                System.out.println("Enter your choice: ");  
                ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        Cust.showAccount();  
                        break;
                    case 2:
                         Cust.deposit();
                        break;
                    case 3:
                         Cust.withdrawal();
                    case 5:
                        System.out.println("Thank you for using our service...");
                        break;
                }
        }while(ch!=5); 
    } 
}
class BankDetails {  
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    } 
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
    }  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    } 
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + " Transaction failed...!!" );  
        }  
    }
}

