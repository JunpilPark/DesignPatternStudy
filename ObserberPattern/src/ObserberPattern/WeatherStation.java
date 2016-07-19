package ObserberPattern;

public class WeatherStation {
	
	public static void  main(String[] args)
	{
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay disp1 = new CurrentConditionsDisplay(weatherData, "disp1");
		CurrentConditionsDisplay disp2 = new CurrentConditionsDisplay(weatherData, "disp2");
		
		weatherData.setMeasurements(10, 20,30);
	}
}
