package strategyPattern;

import strategyPattern.FlyBehavior.FlyBehavior;
import strategyPattern.QuackBehavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck()
	{
		
	}
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void perforQuack()
	{
		quackBehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("¹°¿¡ ¶å´Ï´Ù.");
	}
	
	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior = qb;
	}
}
