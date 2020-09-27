package myfirstproject;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean asMoneyInPocket = true;
		double costOfMilk = 2.50;
		double moneyInWallet = 200;
		int thirtLevel = 4;
		
		boolean shouldBuyIcecream = isHotOutside && asMoneyInPocket ;
		System.out.println("Value of shouldBuyIcecream is  " + shouldBuyIcecream );
		
		boolean willGoSwimming = isHotOutside && (isWeekday || true);
		System.out.println("Value of willGoSwimming is  " + willGoSwimming);
		
		boolean isAgoodDay = isHotOutside && moneyInWallet > 0 && (isWeekday || true);
		System.out.println("Value of isAgoodDay is  " + isAgoodDay);
		
		boolean willBuyMilk = isHotOutside && thirtLevel >= 3 && moneyInWallet >= (costOfMilk * 2);
		System.out.println("Value of willBuyMilk is  " + willBuyMilk);

	}

}
