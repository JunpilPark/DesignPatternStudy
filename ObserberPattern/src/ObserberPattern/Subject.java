package ObserberPattern;

public interface Subject {

	public void regsiterObserber(Obserber o);
	public void notifyObserber();
	public void removeObserber(Obserber o);
	
}
