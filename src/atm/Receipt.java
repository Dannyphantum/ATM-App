package atm;

public class Receipt extends Account {

	public String Balance(){
		return "Current Balance: " + curBalance;
	}
	
	public String Name(){
		return "Name: " + userName;
	}
	
	public String AccountNumber(){
		return "Account Number: " + userAccount;
	}
}

