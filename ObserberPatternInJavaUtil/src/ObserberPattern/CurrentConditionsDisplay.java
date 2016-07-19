package ObserberPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature; 
	private float humidity;
	private float pressuer;
	private Observable observable;
	
	private String displayName;
	
	public CurrentConditionsDisplay(Observable observable, String name) {
		this.observable = observable;
		this.displayName = name;
		this.observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println(displayName + " display Cyrrent condition : ");
		System.out.println( "temperature : " + temperature + ", humidity : " + humidity + ", pressure : " 
		                    + pressuer); 
		                    
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)arg0;
			this.temperature = weatherData.getTemperature();
			this.pressuer = weatherData.getPressure();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}
}
