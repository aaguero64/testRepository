package myfirstproject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peachPrice = 2.50;
		double orangePrice = 1.20;
		double itemPrice = peachPrice + orangePrice;
		double moneyInWallet = 125.30;
		int numberOfFriend = 15; // 
		double myAge = 57;
		String firstName = "Adrian";
		String lastName = "Aguero";
		String middleName = "C";
		
		
		double newMoneyInWallet = moneyInWallet - itemPrice;
		System.out.println("Money left in wallet:" + " " + "$" + newMoneyInWallet);
		
		
		double friendByYear = numberOfFriend / myAge; 
		System.out.println("Number of friends by year: " + " " + friendByYear);
		
				
		String fullName = firstName + " " +middleName + " " + lastName;
		System.out.println("Full Name: " + fullName);
		
		
		
		

	}

}
