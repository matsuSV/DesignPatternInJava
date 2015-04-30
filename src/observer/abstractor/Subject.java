package observer.abstractor;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers;

	protected Subject() {
		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
}
