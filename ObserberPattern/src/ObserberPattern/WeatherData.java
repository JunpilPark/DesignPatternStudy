package ObserberPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	protected ArrayList<Obserber> obserbers;
	protected float temperature;
	protected float humidity;
	protected float pressure;
	
	
	public WeatherData()
	{
		obserbers = new ArrayList<Obserber>();
	}
	
	@Override
	public void regsiterObserber(Obserber o) {
		// TODO Auto-generated method stub
		obserbers.add(o);
	}

	@Override
	public void notifyObserber() {
		for(int i = 0 ; i < obserbers.size() ; i++)
		{
			Obserber observer = (Obserber)obserbers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void removeObserber(Obserber o) {
		int targetIdx = obserbers.indexOf(o);
		if(targetIdx >= 0)
			obserbers.remove(targetIdx);
	}
	
	public void measurementsChanged()
	{
		notifyObserber();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
