package strategyPattern;

import strategyPattern.FlyBehavior.FlyWithWings;
import strategyPattern.QuackBehavior.Quack;

public class MallardDuck extends Duck{

	public MallardDuck()
	{
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 물오리 입니다.");
	}

}
