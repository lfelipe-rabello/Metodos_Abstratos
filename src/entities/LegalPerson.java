package entities;

public class LegalPerson extends Person {
	
private Integer employee;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer employee) {
		super(name, annualIncome);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	@Override
	public Double tax() {
		if (getEmployee() > 10) {
			annualIncome = annualIncome * 0.14;
		}
		else {
			annualIncome = annualIncome * 0.16;
		}
		return annualIncome;

	}
}



