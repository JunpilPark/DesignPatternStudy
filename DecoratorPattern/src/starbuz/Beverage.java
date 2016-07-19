package starbuz;

public abstract class Beverage {
	protected String description = "No Title";
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
}
