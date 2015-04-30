package observer.runner;

import observer.implementor.Company;
import observer.implementor.Worker;

public class Executor {

	public static void main(String[] args) {

		Company company = new Company("Google");
		company.setPresident("Larry Page");

		company.addObserver(new Worker(company, "Shinnosuke Nohara"));
		company.addObserver(new Worker(company, "Nobita Nobi"));

		company.notifyObservers();
	}
}
