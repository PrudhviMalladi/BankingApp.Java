import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount("XYZ"," 840001");
		obj1.showMenu();
	}

}
class BankAccount{
		
int Balance;
int previousTransactions;
String CustomerName;
String CustomerID;
 
BankAccount(String cname, String cid){
	CustomerName =cname;
	CustomerID = cid;
}
void deposit (int amount) {
	if(amount !=0) {
		Balance = Balance + amount;
		previousTransactions =amount;
		
	}
}
void withdraw (int amount ) {
	if(amount !=0);
	Balance = Balance - amount;
	previousTransactions =amount;
}
void getpreviousTransactions () {
	if(previousTransactions>0) {
		System.out.println("Deopisted : "+previousTransactions);
	}
	else if (previousTransactions <0 ) {
		System.out.println("Withdrawn:" +Math.abs(previousTransactions));
	
	}
	else {
		System.out.println("No transaction occured");
	}
	}
void showMenu() {
	char option = '\0';
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome " +CustomerName);
	System.out.println("Your ID is " +CustomerID);
	System.out.println("\n");
	System.out.println("A. CheckBalance");
	System.out.println("B. Deposit");
	System.out.println("C. Withdraw");
	System.out.println("D. previousTransactions");
	System.out.println("E. Exit");
	do {
		System.out.println("*************************************************");
		System.out.println("Enter an option");
		System.out.println("*************************************************");
		option = scanner.next().charAt(0);
		System.out.println("\n");
		switch(option) {
		case 'A':
			System.out.println("-----------------------------------------------");
			System.out.println("Balance = "+Balance);
			System.out.println("-----------------------------------------------");
			System.out.println("\n");
		case 'B':
			System.out.println("-----------------------------------------------");
			System.out.println("Enter amount to deposit");
			System.out.println("-----------------------------------------------");
			int amount = scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
		case 'c':
			System.out.println("-----------------------------------------------");
			System.out.println("Enter an amount to withdraw");
			System.out.println("-----------------------------------------------");
			int amount2= scanner.nextInt();
			deposit(amount2);
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("-----------------------------------------------");
			getpreviousTransactions();
			System.out.println("-----------------------------------------------");
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("-----------------------------------------------");
			break;
			default:
				System.out.println("Invalid option !!. Please enter again");
				break;
		}
		
	}while (option !='E');
	System.out.println("Thank you for your services");
}
}