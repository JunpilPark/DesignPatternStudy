package starbuz;

public class Whip extends CondimentDecorator{
	private Beverage beverage;

	public Whip(Beverage beverage)
	{
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + " + ����ũ��" ;
	}

	@Override
	public double cost() {
		return beverage.cost() + 100;
	}

}
