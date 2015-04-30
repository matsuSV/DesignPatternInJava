package observer.implementor;

import observer.abstractor.Subject;

public class Company extends Subject {

	private String name;
	private String president;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresident() {
		return this.president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
}
