import java.util.Scanner;

//Kevin Lin
public class Assignment1 {
	
	public static Scanner scanner = new Scanner(System.in);
	
	//The correct pin
	public static String pin = "1543";
	
	public static double balance = 0.0;
	
	public static void main(String[] args) {
		String enteredPin = "";
		//Keep looping if the pin they enter isn't the correct pin
		while(!enteredPin.equals(pin)) {
			System.out.println("\nPlease enter the pin: [It's 1543]");
			//Grab their input
			enteredPin = scanner.nextLine();
			//If the pin isn't the pin they say it's the wrong pin
			if(!enteredPin.equals(pin)) {
				System.out.println("Incorrect PIN");
			}
		}
		
		String response = "";
		//While the response doesn't equal "3" (that's exit), continue looping
		while(!response.equals("3")) {
			//Print the balance to 2 decimal places
			System.out.printf("\nAccount balance: $%.2f\n", balance);
			
			System.out.println("\nWhat would you like to do? [Enter the number]");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawl");
			System.out.println("3. Exit");
			
			//Grab what they want to do
			response = scanner.nextLine();
			
			System.out.println("\nYour selection: " + response);
			//Switch through each possible response and perform the respective action
			switch(response) {
				//Deposit
				case "1":
					System.out.println("\nHow much would you like to deposit? [Enter amount]");
					//Increase balance by the double amount of how much they entered
					balance += Double.valueOf(scanner.nextLine());
					System.out.println("\nDeposit successful");
					break;
				//Withdrawl
				case "2":
					System.out.println("\nHow much would you like to withdrawl? [Enter amount]");
					//Grab the amount they wish to withdrawl and change it to a double
					double amount = Double.valueOf(scanner.nextLine());
					//If withdrawling that amount puts the balance under $0 then say they can't do it
					if(balance - amount < 0.0) {
						System.out.println("\nInsufficient Funds");
					} else {
						//Otherwise decrease the balance by the inputted amount
						balance -= amount;
						System.out.println("\nWithdrawl successful");
					}
					break;
				//Exit
				case "3":
					break;
				//Default
				default:
					System.out.println("\nThat wasn't a valid option!");
			}
			
		}
		
	}
	
}