import java.util.*;

class ATM {

	 public static void main(String args[]) {
		
	  
		float balance=0.0f;
		int pin=12345;
		float withdraw=0.0f;
		float deposit=0.0f;                                   //Variable Initialization

		TransactionHistory ob=new TransactionHistory();
		withdraw o=new withdraw();
		deposit op=new deposit();
		Scanner k = new Scanner(System.in);
		System.out.println("Enter your pin");
		int p=k.nextInt();
		if (pin==p){
		while (true) {
			System.out.println("Press (1) for Transaction history");
			System.out.println("Press (2) for withdraw");
			System.out.println("Press (3) Deposit");
			System.out.println("Press (4) Exit");
			int a = k.nextInt();
			switch (a) { 									// Switch case to select selectively
				case 1:
                  ob.Transaction(balance);
					break;

				case 2:
					balance=o.withdraw(balance);
					break;
				case 3:
				balance=op.deposit(balance);
				break;
				case 4:
					System.out.println("Good Bye :)");
				 return;
				 default:
					 System.out.println("you have entered wronh number");

			}
		}
      }
	  else{
		System.out.println("Incorrect pin please try again");
		main(args);
	  }
	}
}

class TransactionHistory {										//Show the balance
	void Transaction(float balance) {
		System.out.println("The total balance is = $ "+balance);
	}
}

class withdraw {                                               //To take the money
	float withdraw(float balance){
		float money;
		System.out.println("how much you want to take");
		Scanner q= new Scanner(System.in);
		money=q.nextFloat();
		if(balance>=money){
		balance=balance-money;
        System.out.println("the reaming balance is = $ "+balance);
		return balance;
	}
		else
		{
		System.out.println("You have less money, Please try again :(");
	}
	return balance;
	}
}

class deposit{                                             //To deposit money
	float deposit(float balance){
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the amount of to deposit");
		float money=k.nextFloat();
		balance=balance+money;
		System.out.println("Balance is = $ "+balance);
		return balance;
	}
}