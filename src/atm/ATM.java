package atm;

import java.util.Scanner;

public class ATM {

	public int cashIn;
	
	public int PIN(int userPin){
		Scanner pin = new Scanner(System.in);
		return userPin = pin.nextInt();
	}

	public String decision(String decision){
		Scanner scan =  new Scanner(System.in);
		return decision = scan.nextLine();
	}
	
	public int deposit(int cashIn){
		Scanner scan = new Scanner(System.in);
		return cashIn = scan.nextInt();
	}
	
	//Method to be activated when user wants to withdraw.
	public int withdrawl(int cashIn){
		Scanner scan = new Scanner(System.in);
		cashIn = scan.nextInt();
		return (-1 * cashIn);
	}
	
}
