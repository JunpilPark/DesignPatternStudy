package starbuz;

public class Espresso extends Beverage{

	public Espresso()
	{
		description = "����������";
	}
	
	@Override
	public double cost() {
		return 1000;
	}

}
