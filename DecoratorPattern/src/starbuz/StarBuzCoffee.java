package starbuz;

public class StarBuzCoffee {
	public static void main(String[] args)
	{
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ": COST - " + beverage.cost());
		
		Beverage mocha = new Mocha(beverage);
		System.out.println(mocha.getDescription() + ": COST - " + mocha.cost());
		
		Beverage machaWhip = new Whip(mocha);
		System.out.println(machaWhip.getDescription() + ": COST - " + machaWhip.cost());
	}
}
