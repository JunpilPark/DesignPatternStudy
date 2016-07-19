package strategyPattern;

import strategyPattern.FlyBehavior.FlyWithRocket;

public class DuckPlay {
	
	public static void main(String[] args)
	{
		Duck mallarDuck = new MallardDuck();
		mallarDuck.display();
		mallarDuck.performFly();
		mallarDuck.perforQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.perforQuack();
		
		modelDuck.setFlyBehavior(new FlyWithRocket());
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.perforQuack();
		
	}
	
}
