package entities;

public abstract class Person {
	
	protected String name;
	protected Double annualIncome;
	
	public Person() {
	}

	public Person(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public Double tax() {
		return getAnnualIncome();
	}
	public String toString() {
		return getName() + ": $ " + String.format("%.2f", annualIncome);
	}

}
