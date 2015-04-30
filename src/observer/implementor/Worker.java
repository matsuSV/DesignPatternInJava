package observer.implementor;

import observer.abstractor.Observer;

public class Worker extends Observer {

	private Company company;
	private String name;

	@Override
	public void update() {
		System.out.println(String.format("I'am %s. I belong to %s. my company president is %s.",
							this.name,
							this.company.getName(),
							this.company.getPresident()));
	}

	public Worker( Company company, String name) {
		this.company = company;
		this.name    = name;
	}
	public Company getCompany() {
		return this.company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
