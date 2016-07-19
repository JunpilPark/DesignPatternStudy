package starbuz;

public class Mocha extends CondimentDecorator{
	private Beverage beverage;

	public Mocha(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " + ��ī";
	}

	@Override
	public double cost() {
		return beverage.cost() + 500;
	}

}
