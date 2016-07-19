package starbuz;

public class HouseBlend extends Beverage{
	
	public HouseBlend()
	{
		description = "House Blending Coffee";
	}
	
	@Override
	public double cost() {
		return 1500;
	}

}
