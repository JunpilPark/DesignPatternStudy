package strategyPattern;

import strategyPattern.FlyBehavior.FlyNoWay;
import strategyPattern.QuackBehavior.Squeak;

public class ModelDuck extends Duck{

	public ModelDuck()
	{
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���� �������� �Դϴ�.");
	}
	
}
