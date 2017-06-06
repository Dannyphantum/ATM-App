package atm;

import java.util.Scanner;

public class ATMApplication {

	public static void main(String[] args) {
		
		ATM a = new ATM();
		
		print("Enter your PIN.");
		a.PIN(0);
		
		print("What would you like to do? (W/D)");
		a.decision("");
		
	}
	
	private static void print(String p){
		System.out.println(p);
	}

}
