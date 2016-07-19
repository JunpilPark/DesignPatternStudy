package ObserberPattern;

public class CurrentConditionsDisplay implements Obserber, DisplayElement {

	private float temperature; 
	private float humidity;
	private float pressuer;
	private Subject weatherData;
	
	private String displayName;
	
	public CurrentConditionsDisplay(Subject weatherData, String name) {
		this.weatherData = weatherData;
		weatherData.regsiterObserber(this);
		
		this.displayName = name;
	}
	
	@Override
	public void display() {
		System.out.println(displayName + " display Cyrrent condition : ");
		System.out.println( "temperature : " + temperature + ", humidity : " + humidity + ", pressure : " 
		                    + pressuer); 
		                    
	}

	@Override
	public void update(float temperature, float humidity, float pressuer) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressuer = pressuer;
		display();
	}

	public CurrentConditionsDisplay(Subject weatherData)
	{
		this.weatherData = weatherData;
		weatherData.regsiterObserber(this);
		
	}
}
