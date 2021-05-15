package entities;

public class PhysicalPerson extends Person {
	
private Double paymentHealth;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double paymentHealth) {
		super(name, annualIncome);
		this.paymentHealth = paymentHealth;
	}

	public Double getPaymentHealth() {
		return paymentHealth;
	}

	public void setPaymentHealth(Double paymentHealth) {
		this.paymentHealth = paymentHealth;
	}
	@Override
	public Double tax() {
			if(getAnnualIncome() < 20000.00) {
				annualIncome = annualIncome * 0.15 - paymentHealth * 0.5;
		}	
			else {
				annualIncome = annualIncome * 0.25 - paymentHealth * 0.5;
			}
		return annualIncome;
	}
	}
	
	



